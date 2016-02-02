/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.electrodomesticos;

/**
 *
 * @author PENA
 */
public abstract class Electrodomestico {
    private String marca;
    private String modelo;
    private String descripcion;
    private int cantidad;
    protected double precio;
    protected String codigo;
    
     public Electrodomestico(String marca, String modelo, String descripcion, int cantidad, double precio, String codigo) {
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.codigo = codigo;
    }
    
    
        public Electrodomestico()
    {
    
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
public abstract double calculapreciofinal();
public abstract Electrodomestico ingresar_datos();
}
