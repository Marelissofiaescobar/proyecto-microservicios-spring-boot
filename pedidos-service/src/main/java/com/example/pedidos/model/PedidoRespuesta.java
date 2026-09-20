package com.example.pedidos.model;

import com.example.pedidos.model.Usuario;

public class PedidoRespuesta {
    private Long id;
    private String producto;
    private Integer cantidad;
    private Usuario usuario;

    public PedidoRespuesta(Long id, String producto, Integer cantidad, Usuario usuario) {
        this.id=id; this.producto=producto; this.cantidad=cantidad; this.usuario=usuario;
    }
    public Long getId(){return id;} public String getProducto(){return producto;}
    public Integer getCantidad(){return cantidad;} public Usuario getUsuario(){return usuario;}
}
