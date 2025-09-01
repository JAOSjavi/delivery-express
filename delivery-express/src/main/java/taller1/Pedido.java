package taller1;

import java.util.Objects;

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
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pedido pedido = (Pedido) obj;
        return numeroPedido == pedido.numeroPedido &&
               nombreCliente.equals(pedido.nombreCliente) &&
               comida.equals(pedido.comida);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(numeroPedido, nombreCliente, comida);
    }
}
