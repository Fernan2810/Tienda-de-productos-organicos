public class Fruta {
    private String nombre;
    private double precio;

    public Fruta(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Fruta: " + nombre + ", Precio: " + precio);
    }
}