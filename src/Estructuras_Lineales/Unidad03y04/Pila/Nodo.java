package Estructuras_Lineales.Unidad03y04.Pila;

public class Nodo {

    int dato; // Valor almacenado en el nodo
    Nodo siguiente; // Referencia al siguiente nodo

    // Inicializa el nodo con un valor y sin enlaces
    public Nodo(int x) {
        this.dato = x;
        this.siguiente = null;
    }
}
