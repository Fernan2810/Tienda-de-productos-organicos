
package gestion_tienda_organica;


public class Fruta extends ProductoOrganico {

    public Fruta(String nombre, String tipo, double precio) {
        super(nombre, tipo, precio);
    }

    @Override
    public double calcularPrecioVenta() {
        // Por ejemplo: margen de ganancia del 20%
        return precio * 1.2;
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        // Aplica un descuento al precio base
        double descuento = precio * (porcentaje / 100);
        return precio - descuento;
    }
}
