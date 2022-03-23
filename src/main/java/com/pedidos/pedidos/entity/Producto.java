package com.pedidos.pedidos.entity;

public class Producto {
    private Integer id;
    private String name;
    private String marca;

    public Producto() {
    }

    public Producto(Integer id, String name, String marca) {
        this.id = id;
        this.name = name;
        this.marca = marca;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
