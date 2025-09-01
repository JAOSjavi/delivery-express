package taller1;

import java.util.ArrayList;
import java.util.List;

public class Utilidades {
    
    /**
     * Método genérico para filtrar una lista de pedidos según un criterio
     * @param lista Lista de pedidos a filtrar
     * @param criterio Interfaz funcional que define el criterio de filtrado
     * @return Lista filtrada
     */
    public static List<Pedido> filtrar(List<Pedido> lista, CriterioFiltro criterio) {
        List<Pedido> resultado = new ArrayList<>();
        for (Pedido pedido : lista) {
            if (criterio.cumpleCriterio(pedido)) {
                resultado.add(pedido);
            }
        }
        return resultado;
    }
    
    /**
     * Interfaz funcional para definir criterios de filtrado
     */
    @FunctionalInterface
    public interface CriterioFiltro {
        boolean cumpleCriterio(Pedido pedido);
    }
}
