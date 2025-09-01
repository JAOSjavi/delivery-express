# 🚚 Delivery Express - Taller de Colecciones y Genéricos en Java

## 📋 Descripción

Este proyecto implementa un sistema de gestión de pedidos de delivery utilizando diferentes colecciones de Java (ArrayList, LinkedList, HashSet, HashMap) y genéricos. El taller está dividido en 4 partes que demuestran el uso práctico de estas estructuras de datos.

## 🏗️ Estructura del Proyecto

```
delivery-express/
├── src/
│   └── main/
│       └── java/
│           └── taller1/
│               ├── Main.java          # Clase principal con toda la lógica
│               ├── Pedido.java        # Modelo de datos para pedidos
│               └── Utilidades.java    # Clase con métodos genéricos
├── target/
│   └── classes/                       # Archivos compilados
├── pom.xml                           # Configuración de Maven
└── README.md                         # Este archivo
```

## 🚀 Cómo Ejecutar

### Prerrequisitos
- Java JDK 8 o superior
- Maven (opcional, pero recomendado)

### Compilación y Ejecución

#### Opción 1: Con Maven (Recomendado)
```bash
# Compilar el proyecto
mvn compile

# Ejecutar el programa
mvn exec:java -Dexec.mainClass="taller1.Main"
```

#### Opción 2: Con Java directamente
```bash
# Navegar al directorio del proyecto
cd delivery-express

# Compilar las clases
javac -cp . src/main/java/taller1/*.java -d target/classes

# Ejecutar el programa
java -cp target/classes taller1.Main
```

## 📚 Explicación de las Partes

### 🔄 **Parte A: Listas (ArrayList y LinkedList)**

**Objetivo:** Comparar el rendimiento de ArrayList y LinkedList para inserciones al inicio.

**Funcionalidades:**
- ✅ Registrar 5 pedidos en orden de llegada usando ArrayList
- ✅ Insertar 2 pedidos urgentes al inicio del ArrayList
- ✅ Repetir el ejercicio usando LinkedList
- ✅ Análisis de rendimiento: O(n) vs O(1) para inserciones al inicio

**Conceptos aplicados:**
- Genéricos (`ArrayList<Pedido>`, `LinkedList<Pedido>`)
- Métodos de inserción: `add()`, `add(0, elemento)`, `addFirst()`
- Interactividad con `Scanner` para entrada de datos

### 🔗 **Parte B: Conjuntos (HashSet)**

**Objetivo:** Demostrar el comportamiento de los conjuntos con elementos únicos.

**Funcionalidades:**
- ✅ Insertar pedidos de la Parte A en un HashSet
- ✅ Incluir duplicados intencionalmente
- ✅ Mostrar cómo HashSet elimina automáticamente los duplicados

**Conceptos aplicados:**
- Implementación de `equals()` y `hashCode()` en la clase `Pedido`
- Comportamiento de conjuntos: elementos únicos
- Eliminación automática de duplicados

### 🗺️ **Parte C: Mapas (HashMap)**

**Objetivo:** Organizar pedidos por cliente usando mapas.

**Funcionalidades:**
- ✅ Usar `HashMap<String, List<Pedido>>` para indexar pedidos por cliente
- ✅ Insertar 3 clientes con varios pedidos cada uno
- ✅ Imprimir todos los pedidos de un cliente específico
- ✅ Calcular e imprimir el total gastado por cada cliente

**Conceptos aplicados:**
- Mapas con valores complejos (Lista de pedidos)
- Iteración sobre entradas del mapa (`Map.Entry`)
- Cálculo de totales por cliente

### ⚙️ **Parte D: Genéricos**

**Objetivo:** Implementar métodos genéricos para filtrar datos.

**Funcionalidades:**
- ✅ Método genérico `filtrar()` en la clase `Utilidades`
- ✅ Filtrar pedidos cuyo producto sea 'Pizza'
- ✅ Filtrar pedidos con total > $50 (simulado)

**Conceptos aplicados:**
- Interfaces funcionales (`@FunctionalInterface`)
- Expresiones lambda para criterios de filtrado
- Métodos genéricos reutilizables

## 🏛️ Arquitectura del Código

### Clase `Pedido`
```java
public class Pedido {
    private int numeroPedido;
    private String nombreCliente;
    private String comida;
    // Constructor, getters, equals(), hashCode(), toString()
}
```

**Características:**
- Modelo de datos inmutable
- Implementa `equals()` y `hashCode()` para uso en HashSet
- Método `toString()` personalizado para visualización

### Clase `Utilidades`
```java
public class Utilidades {
    public static List<Pedido> filtrar(List<Pedido> lista, CriterioFiltro criterio)
    
    @FunctionalInterface
    public interface CriterioFiltro {
        boolean cumpleCriterio(Pedido pedido);
    }
}
```

**Características:**
- Método genérico para filtrar listas
- Interfaz funcional para criterios de filtrado
- Uso de expresiones lambda

### Clase `Main`
**Funcionalidades principales:**
- Interfaz interactiva con el usuario
- Implementación de todas las partes del taller
- Métodos auxiliares para impresión y cálculos


## 🎯 Aprendizajes Clave

1. **Genéricos:** Hacen el código type-safe y reutilizable
2. **Colecciones:** Cada una tiene sus ventajas según el caso de uso
3. **HashSet:** Elimina automáticamente duplicados
4. **HashMap:** Organiza datos por clave-valor eficientemente
5. **Interfaces funcionales:** Permiten comportamiento parametrizable

## 🔧 Personalización

Para modificar el proyecto:

1. **Agregar nuevos tipos de comida:** Modificar `calcularPrecioSimulado()` en `Main.java`
2. **Cambiar criterios de filtrado:** Crear nuevas expresiones lambda en la Parte D
3. **Agregar más clientes:** Extender la sección de HashMap en la Parte C

## 📝 Notas Técnicas

- **Java 8+:** Requerido para expresiones lambda
- **Maven:** Gestión de dependencias (aunque no se usan dependencias externas)
- **Scanner:** Para entrada interactiva de datos
- **Collections Framework:** Uso completo de las colecciones de Java

---

**Desarrollado para el Taller de Programación Orientada a Objetos - Colecciones y Genéricos**
