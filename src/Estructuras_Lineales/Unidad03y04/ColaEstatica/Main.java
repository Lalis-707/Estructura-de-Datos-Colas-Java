package Estructuras_Lineales.Unidad03y04.ColaEstatica;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== COLA ESTÁTICA LINEAL (capacidad 5) =====");
        ColaEstatica cola = new ColaEstatica(5);

        System.out.println("\n--- Encolar 10, 20, 30, 40, 50 ---");
        for (int i = 1; i <= 5; i++) cola.encolar(i * 10);
        cola.mostrar();
        cola.mostrarIndices();

        System.out.println("\n--- Intentar encolar 60 (cola llena) ---");
        cola.encolar(60);

        System.out.println("\n--- peek() ---");
        System.out.println("Frente: " + cola.peek());
        cola.mostrar();

        System.out.println("\n--- Desencolar dos veces ---");
        System.out.println("Desencolado: " + cola.desencolar());
        System.out.println("Desencolado: " + cola.desencolar());
        cola.mostrar();
        cola.mostrarIndices();

        System.out.println("\n--- Intentar encolar 60 con 2 huecos al inicio ---");
        cola.encolar(60);
        System.out.println("(Limitación: espacio desperdiciado, no se reutiliza)");

        System.out.println("\n--- Vaciar la cola ---");
        while (!cola.estaVacia()) System.out.println("Desencolado: " + cola.desencolar());
        cola.mostrar();
        System.out.println("peek() en cola vacía: " + cola.peek());
    }
}
