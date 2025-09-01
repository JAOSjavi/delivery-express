package taller1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== DELIVERY EXPRESS - TALLER COMPLETO ===\n");
        
        // ===== PARTE A: LISTAS =====
        System.out.println("=== PARTE A: LISTAS (ArrayList y LinkedList) ===");
        
        // ArrayList - 5 pedidos normales
        System.out.println("1. ARRAYLIST - Ingresa 5 pedidos:");
        ArrayList<Pedido> pedidosArrayList = new ArrayList<>();
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("\n--- Pedido #" + i + " ---");
            System.out.print("Nombre del cliente: ");
            String nombre = scanner.nextLine();
            System.out.print("Comida que desea: ");
            String comida = scanner.nextLine();
            
            pedidosArrayList.add(new Pedido(i, nombre, comida));
        }
        
        System.out.println("\nLista de pedidos en ArrayList:");
        imprimirLista(pedidosArrayList);
        
        // ArrayList - 2 pedidos urgentes al inicio
        System.out.println("\n2. ARRAYLIST - Ingresa 2 pedidos urgentes (se insertarán al inicio):");
        
        for (int i = 6; i <= 7; i++) {
            System.out.println("\n--- Pedido Urgente #" + i + " ---");
            System.out.print("Nombre del cliente: ");
            String nombre = scanner.nextLine();
            System.out.print("Comida que desea: ");
            String comida = scanner.nextLine();
            
            pedidosArrayList.add(0, new Pedido(i, nombre, comida));
        }
        
        System.out.println("\nLista de pedidos en ArrayList (con urgentes al inicio):");
        imprimirLista(pedidosArrayList);
        
        // LinkedList - Repetir el ejercicio
        System.out.println("\n3. LINKEDLIST - Ingresa 5 pedidos nuevamente:");
        LinkedList<Pedido> pedidosLinkedList = new LinkedList<>();
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("\n--- Pedido #" + i + " ---");
            System.out.print("Nombre del cliente: ");
            String nombre = scanner.nextLine();
            System.out.print("Comida que desea: ");
            String comida = scanner.nextLine();
            
            pedidosLinkedList.add(new Pedido(i, nombre, comida));
        }
        
        System.out.println("\nLista de pedidos en LinkedList:");
        imprimirLista(pedidosLinkedList);
        
        // LinkedList - 2 pedidos urgentes al inicio
        System.out.println("\nLINKEDLIST - Ingresa 2 pedidos urgentes (se insertarán al inicio):");
        
        for (int i = 6; i <= 7; i++) {
            System.out.println("\n--- Pedido Urgente #" + i + " ---");
            System.out.print("Nombre del cliente: ");
            String nombre = scanner.nextLine();
            System.out.print("Comida que desea: ");
            String comida = scanner.nextLine();
            
            pedidosLinkedList.addFirst(new Pedido(i, nombre, comida));
        }
        
        System.out.println("\nLista de pedidos en LinkedList (con urgentes al inicio):");
        imprimirLista(pedidosLinkedList);
        
        // ===== PARTE B: HASHSET =====
        System.out.println("\n=== PARTE B: HASHSET (Conjuntos) ===");
        
        HashSet<Pedido> pedidosHashSet = new HashSet<>();
        
        // Agregar todos los pedidos del ArrayList (incluyendo duplicados)
        System.out.println("Agregando pedidos del ArrayList al HashSet...");
        for (Pedido pedido : pedidosArrayList) {
            pedidosHashSet.add(pedido);
            // Intentar agregar duplicados
            pedidosHashSet.add(new Pedido(pedido.getNumeroPedido(), pedido.getNombreCliente(), pedido.getComida()));
        }
        
        // Agregar todos los pedidos del LinkedList
        System.out.println("Agregando pedidos del LinkedList al HashSet...");
        for (Pedido pedido : pedidosLinkedList) {
            pedidosHashSet.add(pedido);
        }
        
        System.out.println("\nContenido del HashSet:");
        imprimirSet(pedidosHashSet);
        
        System.out.println("\nExplicación sobre duplicados:");
        System.out.println("- HashSet NO permite elementos duplicados");
        System.out.println("- Los duplicados se eliminan automáticamente");
        System.out.println("- Solo quedan elementos únicos en el conjunto");
        
        // ===== PARTE C: HASHMAP =====
        System.out.println("\n=== PARTE C: HASHMAP (Mapas) ===");
        
        HashMap<String, List<Pedido>> pedidosPorCliente = new HashMap<>();
        
        // Crear pedidos para 3 clientes diferentes
        System.out.println("Creando pedidos para 3 clientes...");
        
        // Cliente 1: Juan Pérez
        List<Pedido> pedidosJuan = new ArrayList<>();
        pedidosJuan.add(new Pedido(1, "Juan Pérez", "Pizza Margherita"));
        pedidosJuan.add(new Pedido(2, "Juan Pérez", "Hamburguesa"));
        pedidosJuan.add(new Pedido(3, "Juan Pérez", "Ensalada César"));
        pedidosPorCliente.put("Juan Pérez", pedidosJuan);
        
        // Cliente 2: María García
        List<Pedido> pedidosMaria = new ArrayList<>();
        pedidosMaria.add(new Pedido(4, "María García", "Pizza Hawaiana"));
        pedidosMaria.add(new Pedido(5, "María García", "Pasta Carbonara"));
        pedidosMaria.add(new Pedido(6, "María García", "Sushi"));
        pedidosMaria.add(new Pedido(7, "María García", "Helado"));
        pedidosPorCliente.put("María García", pedidosMaria);
        
        // Cliente 3: Carlos López
        List<Pedido> pedidosCarlos = new ArrayList<>();
        pedidosCarlos.add(new Pedido(8, "Carlos López", "Pizza Pepperoni"));
        pedidosCarlos.add(new Pedido(9, "Carlos López", "Tacos"));
        pedidosPorCliente.put("Carlos López", pedidosCarlos);
        
        // Imprimir pedidos de un cliente específico
        System.out.println("\nPedidos de Juan Pérez:");
        List<Pedido> pedidosJuanCliente = pedidosPorCliente.get("Juan Pérez");
        if (pedidosJuanCliente != null) {
            imprimirLista(pedidosJuanCliente);
        }
        
        // Calcular total gastado por cada cliente
        System.out.println("\nTotal gastado por cada cliente:");
        for (Map.Entry<String, List<Pedido>> entry : pedidosPorCliente.entrySet()) {
            String cliente = entry.getKey();
            List<Pedido> pedidos = entry.getValue();
            double total = calcularTotal(pedidos);
            System.out.println(cliente + ": $" + String.format("%.2f", total) + " (" + pedidos.size() + " pedidos)");
        }
        
        // ===== PARTE D: GENÉRICOS =====
        System.out.println("\n=== PARTE D: GENÉRICOS ===");
        
        // Crear una lista combinada para filtrar
        List<Pedido> todosLosPedidos = new ArrayList<>();
        todosLosPedidos.addAll(pedidosArrayList);
        todosLosPedidos.addAll(pedidosLinkedList);
        
        System.out.println("Lista completa de pedidos:");
        imprimirLista(todosLosPedidos);
        
        // Filtrar pedidos de Pizza
        System.out.println("\nPedidos de Pizza:");
        List<Pedido> pedidosPizza = Utilidades.filtrar(todosLosPedidos, 
            pedido -> pedido.getComida().toLowerCase().contains("pizza"));
        imprimirLista(pedidosPizza);
        
        // Filtrar pedidos con total > $50 (simulando precios)
        System.out.println("\nPedidos con total > $50 (simulado):");
        List<Pedido> pedidosCaros = Utilidades.filtrar(todosLosPedidos, 
            pedido -> calcularPrecioSimulado(pedido) > 50.0);
        imprimirLista(pedidosCaros);
        
        // Análisis de rendimiento
        System.out.println("\n=== ANÁLISIS DE RENDIMIENTO ===");
        System.out.println("Para 1000 pedidos urgentes:");
        System.out.println("- ArrayList: O(n) - Necesita desplazar todos los elementos existentes");
        System.out.println("- LinkedList: O(1) - Solo cambia las referencias de los nodos");
        System.out.println("CONCLUSIÓN: LinkedList es más eficiente para inserciones al inicio");
        
        scanner.close();
    }
    
    private static void imprimirLista(List<Pedido> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        }
    }
    
    private static void imprimirSet(Set<Pedido> set) {
        int i = 1;
        for (Pedido pedido : set) {
            System.out.println(i + ". " + pedido);
            i++;
        }
    }
    
    private static double calcularTotal(List<Pedido> pedidos) {
        double total = 0.0;
        for (Pedido pedido : pedidos) {
            total += calcularPrecioSimulado(pedido);
        }
        return total;
    }
    
    private static double calcularPrecioSimulado(Pedido pedido) {
        // Simular precios basados en el tipo de comida
        String comida = pedido.getComida().toLowerCase();
        if (comida.contains("pizza")) return 25.0;
        if (comida.contains("hamburguesa")) return 15.0;
        if (comida.contains("pasta")) return 18.0;
        if (comida.contains("sushi")) return 35.0;
        if (comida.contains("tacos")) return 12.0;
        if (comida.contains("ensalada")) return 10.0;
        if (comida.contains("helado")) return 8.0;
        return 20.0; // Precio por defecto
    }
}