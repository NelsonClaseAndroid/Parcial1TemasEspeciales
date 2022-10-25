package com.pucmm.a1erparcialtemasespeciales;

public class Product {
    private String articulo;
    private String descripcion;
    private String precio;

    public Product(String articulo, String descripcion, String precio) {
        this.articulo = articulo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
