package Estructuras_Lineales.Unidad03y04.Pila;

public class PilaDinamica {

    Nodo cima; // Referencia al nodo que está en la cima

    // Inicializa la pila sin elementos
    public PilaDinamica() {
        this.cima = null;
    }

    // Inserta un nuevo nodo en la cima
    public void push(int x) {
        Nodo nuevo = new Nodo(x);
        nuevo.siguiente = cima; // Enlaza el nuevo nodo con el anterior
        cima = nuevo; // Actualiza la cima
    }

    // Retira el nodo que está en la cima
    public void pop() {
        if (!isEmpty()) {
            System.out.println("Sacaste de la pila: " + cima.dato);
            cima = cima.siguiente; // La cima pasa al siguiente nodo
        } else {
            System.out.println("La pila está vacía.");
        }
    }

    // Recorre los nodos e imprime sus valores
    public void mostrar() {
        System.out.println("\nPILA ACTUAL:");
        for (Nodo actual = cima; actual != null;
             actual = actual.siguiente) {
            System.out.print(actual.dato + " ");
        }
        System.out.println();
    }

    // Comprueba si la cima no apunta a ningún nodo
    public boolean isEmpty() {
        return cima == null;
    }

    // Consulta el valor de la cima sin retirar el nodo
    public int peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return -1;
        }
        return cima.dato;
    }
}
