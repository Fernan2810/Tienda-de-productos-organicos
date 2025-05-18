
package gestion_tienda_organica;


public class Verdura extends ProductoOrganico {

    public Verdura(String nombre, String tipo, double precio) {
        super(nombre, tipo, precio);
    }

    @Override
    public double calcularPrecioVenta() {
        // Por ejemplo: margen de ganancia del 15%
        return precio * 1.15;
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        // Aplica un descuento al precio base
        double descuento = precio * (porcentaje / 100);
        return precio - descuento;
    }
}
