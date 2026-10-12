package Estructuras_Lineales.Unidad03y04.Pila;

public class MainPSimple {

    public static void main(String[] args) {

        PilaSimple p = new PilaSimple();

        System.out.println("¿Está vacía? " + p.isEmpty());

        // Insertamos tres elementos siguiendo el orden LIFO
        p.push(10);
        p.push(20);
        p.push(30);

        p.mostrar();

        // Consultamos la cima sin modificar la pila
        System.out.println("Elemento en la cima: " + p.peek());

        p.pop(); // Retira el 30, que fue el último en entrar
        p.mostrar();

        System.out.println("\n¿Está llena? " + p.isFull());
        System.out.println("¿Está vacía? " + p.isEmpty());
    }
}