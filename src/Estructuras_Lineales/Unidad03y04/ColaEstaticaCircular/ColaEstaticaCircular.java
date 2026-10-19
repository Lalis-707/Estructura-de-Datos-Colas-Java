package Estructuras_Lineales.Unidad03y04.ColaEstaticaCircular;
/**
 * Cola estática circular: los índices dan la vuelta con módulo,
 * reutilizando las posiciones liberadas.
 */
public class ColaEstaticaCircular {

    private int[] datos;
    private int frente;
    private int fin;
    private int tamano;

    public ColaEstaticaCircular(int capacidad) {
        this.datos = new int[capacidad];
        this.frente = 0;
        this.fin = -1;
        this.tamano = 0;
    }

    public boolean estaVacia() {
        return tamano == 0;
    }

    public boolean estaLlena() {
        return tamano == datos.length;
    }

    public void encolar(int x) {
        if (estaLlena()) {
            System.out.println("La cola está llena");
            return;
        }
        fin = (fin + 1) % datos.length;
        datos[fin] = x;
        tamano++;
    }

    public int desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return -1;
        }
        int valor = datos[frente];
        frente = (frente + 1) % datos.length;
        tamano--;
        return valor;
    }

    // Consulta el elemento al frente sin modificar los apuntadores
    public int peek() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return -1;
        }
        return datos[frente];
    }

    public int tamano() {
        return tamano;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía");
            return;
        }
        System.out.print("Frente -> ");
        for (int i = 0; i < tamano; i++) {
            System.out.print("[" + datos[(frente + i) % datos.length] + "] ");
        }
        System.out.println("<- Fin");
    }

    public void mostrarIndices() {
        System.out.println("frente=" + frente + ", fin=" + fin
                + ", tamaño=" + tamano + ", capacidad=" + datos.length);
    }
}
