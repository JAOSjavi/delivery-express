package taller1;

public class Pedido {
    private int numeroPedido;
    private String nombreCliente;
    private String comida;
    
    public Pedido(int numeroPedido, String nombreCliente, String comida) {
        this.numeroPedido = numeroPedido;
        this.nombreCliente = nombreCliente;
        this.comida = comida;
    }
    
    // Getters
    public int getNumeroPedido() { return numeroPedido; }
    public String getNombreCliente() { return nombreCliente; }
    public String getComida() { return comida; }
    
    @Override
    public String toString() {
        return String.format("Pedido #%d - Cliente: %s - Comida: %s", 
                           numeroPedido, nombreCliente, comida);
    }
}
