package Estructuras_Lineales.Unidad03y04.ColaDinamica;
import Estructuras_Lineales.Unidad03y04.PilaDinamica.Nodo;

public class ColaDinamica {
    private Nodo frente;
    private Nodo fin;

    public ColaDinamica() {
        this.frente = null;
        this.fin = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void encolar(int x) {
        Nodo nuevo = new Nodo(x);
        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public int desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return -1;
        }
        int valor = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        return valor;
    }

    // Consulta el valor del nodo al frente sin desvincularlo
    public int peek() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return -1;
        }
        return frente.dato;
    }

    // Cuenta los nodos activos mediante un recorrido
    public int contarElementos() {
        int contador = 0;
        Nodo actual = frente;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía");
            return;
        }
        Nodo actual = frente;
        System.out.print("Frente -> ");
        while (actual != null) {
            System.out.print("[" + actual.dato + "] ");
            actual = actual.siguiente;
        }
        System.out.println("<- Fin");
    }
}