package com.example.pedidos.model;

public class Pedido {
    private Long id;
    private String producto;
    private Integer cantidad;
    private Long usuarioId;

    public Pedido() {}
    public Pedido(Long id, String producto, Integer cantidad, Long usuarioId) {
        this.id=id; this.producto=producto; this.cantidad=cantidad; this.usuarioId=usuarioId;
    }
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getProducto(){return producto;} public void setProducto(String producto){this.producto=producto;}
    public Integer getCantidad(){return cantidad;} public void setCantidad(Integer cantidad){this.cantidad=cantidad;}
    public Long getUsuarioId(){return usuarioId;} public void setUsuarioId(Long usuarioId){this.usuarioId=usuarioId;}
}
