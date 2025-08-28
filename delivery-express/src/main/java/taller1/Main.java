package taller1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== DELIVERY EXPRESS - PARTE A: LISTAS INTERACTIVAS ===\n");
        
        // Parte A.1: ArrayList - Registrar 5 pedidos ingresados por el usuario
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
        
        // Parte A.2: ArrayList - Insertar 2 pedidos urgentes al inicio
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
        
        // Parte A.3: LinkedList - Repetir el ejercicio
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
        
        // Insertar 2 pedidos urgentes al inicio en LinkedList
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
}