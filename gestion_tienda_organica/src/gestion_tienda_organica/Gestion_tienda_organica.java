
package gestion_tienda_organica;


public class Gestion_tienda_organica {


    public static void main(String[] args) {
        Fruta guineo = new Fruta("Manzana", "Fruta Roja", 1.00);
        Verdura papa = new Verdura("Zanahoria", "Raíz", 0.80);

        System.out.println(guineo);
        System.out.println("Precio de venta: $" + guineo.calcularPrecioVenta());
        System.out.println("Precio con 10% de descuento: $" + guineo.aplicarDescuento(10));

        System.out.println();

        System.out.println(papa);
        System.out.println("Precio de venta: $" + papa.calcularPrecioVenta());
        System.out.println("Precio con 5% de descuento: $" + papa.aplicarDescuento(5));    }
    
}
