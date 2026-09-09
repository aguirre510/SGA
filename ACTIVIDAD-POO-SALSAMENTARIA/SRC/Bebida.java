public class Bebida extends Producto {
    private String tamanoPresentacion;

    public Bebida(String id, String nombre, double precioBase, int stock, String fechaVencimiento, String tamanoPresentacion) {
        super(id, nombre, precioBase, stock, fechaVencimiento);
        this.tamanoPresentacion = tamanoPresentacion;
    }

    @Override
    public double calcularPrecioVenta() {
        return getPrecioBase() * 1.19;
    }

    @Override
    public boolean verificarRefrigeracion() {
        return false;
    }

    @Override
    public void mostrarInformacionDetallada() {
        System.out.println("[BEBIDA] " + getNombre() + " (" + tamanoPresentacion + ") - Stock: " + getStock() + " - Precio Final: $" + calcularPrecioVenta());
    }

    @Override
    public String obtenerTipoConservacion() {
        return "Lugar fresco. Refrigerar antes de servir.";
    }

    @Override
    public double calcularDescuentoPorLote(int cantidad) {
        if (cantidad > 50) return 0.15;
        return 0.0;
    }
}