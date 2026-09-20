package com.example.usuarios.controller;

import com.example.usuarios.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final List<Usuario> usuarios = List.of(
        new Usuario(1L, "Omar", "omar@example.com"),
        new Usuario(2L, "Ana", "ana@example.com"),
        new Usuario(3L, "Carlos", "carlos@example.com")
    );

    @GetMapping
    public List<Usuario> listar() { return usuarios; }

    @GetMapping("/{id}")
    public ResponseEntity<?> obtener(@PathVariable Long id) {
        return usuarios.stream().filter(u -> u.getId().equals(id)).findFirst()
            .<ResponseEntity<?>>map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.status(404).body(Map.of("mensaje", "Usuario no encontrado")));
    }
}
