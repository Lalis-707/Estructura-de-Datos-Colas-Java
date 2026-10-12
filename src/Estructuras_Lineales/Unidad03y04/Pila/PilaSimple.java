package Estructuras_Lineales.Unidad03y04.Pila;

public class PilaSimple {

    int[] datos = new int[5]; // Arreglo con capacidad para 5 elementos
    int tope = -1; // -1 indica que la pila está vacía

    // Inserta un elemento si todavía hay espacio
    public void push(int x) {
        if (!isFull()) {
            tope++; // Avanza a la siguiente posición disponible
            datos[tope] = x;
            System.out.println("Metiste: " + x);
        } else {
            System.out.println("¡Pila llena!");
        }
    }

    // Elimina el elemento que está en la cima
    public void pop() {
        if (!isEmpty()) {
            System.out.println("Sacaste: " + datos[tope]);
            tope--; // Baja el tope para retirar el elemento
        } else {
            System.out.println("¡Pila vacía!");
        }
    }

    // Muestra los elementos desde la cima hasta la base
    public void mostrar() {
        System.out.print("\nPila actual: ");
        for (int i = tope; i >= 0; i--) {
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }

    // Comprueba si no hay elementos en la pila
    public boolean isEmpty() {
        return tope == -1;
    }

    // Verifica si se alcanzó la última posición del arreglo
    public boolean isFull() {
        return tope == datos.length - 1;
    }

    // Consulta el elemento de la cima sin eliminarlo
    public int peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return -1;
        }
        return datos[tope];
    }
}
