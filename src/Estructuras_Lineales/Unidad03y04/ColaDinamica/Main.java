package Estructuras_Lineales.Unidad03y04.ColaDinamica;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== COLA DINÁMICA (sin capacidad fija) =====");
        ColaDinamica cola = new ColaDinamica();

        System.out.println("\n--- Encolar 10, 20, 30, 40, 50, 60, 70 ---");
        for (int i = 1; i <= 7; i++) cola.encolar(i * 10);
        cola.mostrar();
        System.out.println("Elementos: " + cola.contarElementos());

        System.out.println("\n--- peek() ---");
        System.out.println("Frente: " + cola.peek());
        System.out.println("Elementos: " + cola.contarElementos());

        System.out.println("\n--- Desencolar dos veces ---");
        System.out.println("Desencolado: " + cola.desencolar());
        System.out.println("Desencolado: " + cola.desencolar());
        cola.mostrar();
        System.out.println("Elementos: " + cola.contarElementos());

        System.out.println("\n--- Vaciar la cola ---");
        while (!cola.estaVacia()) System.out.println("Desencolado: " + cola.desencolar());
        cola.mostrar();
        System.out.println("Elementos: " + cola.contarElementos());
        System.out.println("peek() en cola vacía: " + cola.peek());
    }
}

