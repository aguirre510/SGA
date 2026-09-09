import java.util.Scanner;

// R1: ABSTRACCIÓN - Clase Padre Abstracta
public abstract class Producto {
    // R3: ENCAPSULAMIENTO - Atributos privados
    private String id;
    private String nombre;
    private double precioBase;
    private int stock;
    private String fechaVencimiento;

    // R4: CONSTRUCTOR con 'this'
    public Producto(String id, String nombre, double precioBase, int stock, String fechaVencimiento) {
        this.id = id;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.stock = stock;
        this.fechaVencimiento = fechaVencimiento;
    }

    // Getters y Setters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
    public String getFechaVencimiento() { return fechaVencimiento; }

    // R1: 5 MÉTODOS ABSTRACTOS
    public abstract double calcularPrecioVenta();              // R6: Método con retorno
    public abstract boolean verificarRefrigeracion();         // R6: Método con retorno
    public abstract void mostrarInformacionDetallada();       // R6: Método void
    public abstract String obtenerTipoConservacion();
    public abstract double calcularDescuentoPorLote(int cantidad);
}