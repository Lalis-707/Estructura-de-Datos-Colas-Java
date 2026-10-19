package Estructuras_Lineales.Unidad03y04.ColaEstatica;
/**
 * Cola estática lineal con arreglo.
 * Los índices frente y fin solo avanzan: al desencolar NO se reutilizan
 * las posiciones liberadas (limitación que resuelve la cola circular).
 */
public class ColaEstatica {

    private int[] datos;
    private int frente; // índice del primer elemento
    private int fin;    // índice del último elemento (-1 si nunca se encoló)

    public ColaEstatica(int capacidad) {
        this.datos = new int[capacidad];
        this.frente = 0;
        this.fin = -1;
    }

    public boolean estaVacia() {
        return frente > fin;
    }

    // "Llena" cuando fin llegó al último índice, aunque haya huecos al inicio
    public boolean estaLlena() {
        return fin == datos.length - 1;
    }

    public void encolar(int x) {
        if (estaLlena()) {
            System.out.println("La cola está llena (fin en el último índice)");
            return;
        }
        datos[++fin] = x;
    }

    public int desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return -1;
        }
        return datos[frente++];
    }

    // Consulta el elemento al frente sin extraerlo
    public int peek() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return -1;
        }
        return datos[frente];
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía");
            return;
        }
        System.out.print("Frente -> ");
        for (int i = frente; i <= fin; i++) {
            System.out.print("[" + datos[i] + "] ");
        }
        System.out.println("<- Fin");
    }

    // Auxiliar para el reporte: muestra los índices internos
    public void mostrarIndices() {
        System.out.println("frente=" + frente + ", fin=" + fin
                + ", capacidad=" + datos.length);
    }
}
