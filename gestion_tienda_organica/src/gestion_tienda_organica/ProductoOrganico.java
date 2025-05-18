/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_tienda_organica;

/**
 *
 * @author Lenovo
 */
public abstract class ProductoOrganico {
    protected String nombre;
    protected String tipo;
    protected double precio;
    
    //constructor
    public ProductoOrganico(String nombre, String tipo, double  precio){
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }
    
    //getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }
    
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
            
    // toString
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Tipo: " + tipo + ", Precio: $" + precio;
    }

    // Métodos abstractos
    public abstract double calcularPrecioVenta();

    public abstract double aplicarDescuento(double porcentaje);
    
}
