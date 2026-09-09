import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE GESTIÓN DE ALMACENAMIENTO - SALSAMENTARIA (SGA) ===");

        // R7: ENTRADA POR CONSOLA con Scanner
        System.out.println("\n--- REGISTRO DE UN NUEVO EMBUTIDO POR TECLADO ---");
        System.out.print("Ingrese ID del producto: ");
        String id = sc.nextLine();

        System.out.print("Ingrese Nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese Precio Base: ");
        double precioBase = sc.nextDouble();

        System.out.print("Ingrese Stock actual: ");
        int stock = sc.nextInt();
        sc.nextLine(); // Limpiar búfer

        System.out.print("Ingrese Fecha Vencimiento (DD/MM/AAAA): ");
        String fecha = sc.nextLine();

        // R8: LÓGICA CON CONDICIONALES
        if (stock < 10) {
            System.out.println("-> [ALERTA INVENTARIO] Stock crítico. Se requiere reabastecimiento.");
        } else {
            System.out.println("-> [OK] Nivel de stock adecuado.");
        }

        Embutido productoIngresado = new Embutido(id, nombre, precioBase, stock, fecha, "Cerdo/Res");

        // R5: POLIMORFISMO - Arreglo del tipo padre
        Producto[] inventario = new Producto[4];
        inventario[0] = productoIngresado;
        inventario[1] = new Lacteo("L01", "Queso Mozzarella 500g", 15000, 25, "15/10/2026", 22.5);
        inventario[2] = new Bebida("B01", "Jugo de Naranja 1L", 6500, 40, "30/12/2026", "1 Litro");
        inventario[3] = new Enlatado("E01", "Maíz Dulce Enlatado", 4500, 100, "01/01/2028", true);

        // R9: SALIDA POR CONSOLA
        System.out.println("\n==========================================");
        System.out.println("    INVENTARIO GENERAL DE SALSAMENTARIA");
        System.out.println("==========================================");

        for (Producto prod : inventario) {
            prod.mostrarInformacionDetallada();
            System.out.println("   Conservación: " + prod.obtenerTipoConservacion());
            System.out.println("   ¿Requiere Cava/Nevera?: " + (prod.verificarRefrigeracion() ? "SÍ" : "NO"));
            System.out.println("   Descuento por lote (25 uds): " + (prod.calcularDescuentoPorLote(25) * 100) + "%");
            System.out.println("------------------------------------------");
        }

        sc.close();
    }
}