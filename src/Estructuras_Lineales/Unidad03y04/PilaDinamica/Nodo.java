package Estructuras_Lineales.Unidad03y04.PilaDinamica;

public class Nodo {

    public int dato; // Valor almacenado en el nodo
    public Nodo siguiente; // Referencia al siguiente nodo

    // Inicializa el nodo con un valor y sin enlaces
    public Nodo(int x) {
        this.dato = x;
        this.siguiente = null;
    }
}
