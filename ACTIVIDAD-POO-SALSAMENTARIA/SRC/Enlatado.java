public class Enlatado extends Producto {
    private boolean abreFacil;

    public Enlatado(String id, String nombre, double precioBase, int stock, String fechaVencimiento, boolean abreFacil) {
        super(id, nombre, precioBase, stock, fechaVencimiento);
        this.abreFacil = abreFacil;
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
        System.out.println("[ENLATADO] " + getNombre() + " (Abre Fácil: " + (abreFacil ? "Sí" : "No") + ") - Stock: " + getStock() + " - Precio Final: $" + calcularPrecioVenta());
    }

    @Override
    public String obtenerTipoConservacion() {
        return "Almacenar a temperatura ambiente en lugar seco.";
    }

    @Override
    public double calcularDescuentoPorLote(int cantidad) {
        if (cantidad > 30) return 0.12;
        return 0.0;
    }
}