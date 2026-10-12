package Estructuras_Lineales.Unidad03y04.Pila;

public class MainPDinamica {

    public static void main(String[] args) {

        PilaDinamica pila = new PilaDinamica();

        System.out.println("¿Está vacía? " + pila.isEmpty());

        // Insertamos los elementos creando nuevos nodos
        pila.push(10);
        pila.push(20);
        pila.push(30);

        pila.mostrar();

        // Consultamos el valor de la cima sin eliminarlo
        System.out.println("Elemento en la cima: " + pila.peek());

        pila.pop(); // Retira el nodo que contiene el 30
        pila.mostrar();

        System.out.println("¿Está vacía? " + pila.isEmpty());
    }
}