package com.example.pedidos.client;

import com.example.pedidos.model.Usuario;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class UsuarioClient {
    private final RestClient client = RestClient.builder().baseUrl("http://localhost:8081").build();

    public Usuario obtenerUsuario(Long id) {
        return client.get().uri("/usuarios/{id}", id).retrieve().body(Usuario.class);
    }
}
