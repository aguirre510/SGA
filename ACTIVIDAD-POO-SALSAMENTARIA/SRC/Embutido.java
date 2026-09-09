// R2: HERENCIA - Clase Hija
public class Embutido extends Producto {
    private String tipoCarne;

    public Embutido(String id, String nombre, double precioBase, int stock, String fechaVencimiento, String tipoCarne) {
        super(id, nombre, precioBase, stock, fechaVencimiento);
        this.tipoCarne = tipoCarne;
    }

    @Override
    public double calcularPrecioVenta() {
        return getPrecioBase() * 1.19; // IVA 19%
    }

    @Override
    public boolean verificarRefrigeracion() {
        return true;
    }

    @Override
    public void mostrarInformacionDetallada() {
        System.out.println("[EMBUTIDO] " + getNombre() + " (" + tipoCarne + ") - Stock: " + getStock() + " - Precio Final: $" + calcularPrecioVenta());
    }

    @Override
    public String obtenerTipoConservacion() {
        return "Refrigerar a máximo 4°C";
    }

    @Override
    public double calcularDescuentoPorLote(int cantidad) {
        if (cantidad > 20) return 0.10;
        return 0.0;
    }
}