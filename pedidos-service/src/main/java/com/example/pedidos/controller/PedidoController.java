package com.example.pedidos.controller;

import com.example.pedidos.client.UsuarioClient;
import com.example.pedidos.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    private final UsuarioClient usuarioClient;
    private final List<Pedido> pedidos = List.of(
        new Pedido(1L, "Laptop", 1, 1L),
        new Pedido(2L, "Mouse", 2, 2L),
        new Pedido(3L, "Teclado", 1, 3L)
    );

    public PedidoController(UsuarioClient usuarioClient) { this.usuarioClient = usuarioClient; }

    @GetMapping
    public List<Pedido> listar() { return pedidos; }

    @GetMapping("/{id}")
    public ResponseEntity<?> obtener(@PathVariable Long id) {
        return pedidos.stream().filter(p -> p.getId().equals(id)).findFirst().map(p -> {
            try {
                Usuario usuario = usuarioClient.obtenerUsuario(p.getUsuarioId());
                return ResponseEntity.ok(new PedidoRespuesta(p.getId(), p.getProducto(), p.getCantidad(), usuario));
            } catch (Exception e) {
                return ResponseEntity.status(503).body(Map.of("mensaje", "No fue posible comunicarse con el servicio de usuarios"));
            }
        }).orElseGet(() -> ResponseEntity.status(404).body(Map.of("mensaje", "Pedido no encontrado")));
    }
}
