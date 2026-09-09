public class Lacteo extends Producto {
    private double porcentajeGrasa;

    public Lacteo(String id, String nombre, double precioBase, int stock, String fechaVencimiento, double porcentajeGrasa) {
        super(id, nombre, precioBase, stock, fechaVencimiento);
        this.porcentajeGrasa = porcentajeGrasa;
    }

    @Override
    public double calcularPrecioVenta() {
        return getPrecioBase() * 1.05;
    }

    @Override
    public boolean verificarRefrigeracion() {
        return true;
    }

    @Override
    public void mostrarInformacionDetallada() {
        System.out.println("[LÁCTEO] " + getNombre() + " (Grasa: " + porcentajeGrasa + "%) - Stock: " + getStock() + " - Precio Final: $" + calcularPrecioVenta());
    }

    @Override
    public String obtenerTipoConservacion() {
        return "Mantener refrigerado y consumir pronto tras abrir.";
    }

    @Override
    public double calcularDescuentoPorLote(int cantidad) {
        if (cantidad > 15) return 0.08;
        return 0.0;
    }
}