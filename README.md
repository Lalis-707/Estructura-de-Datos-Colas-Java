# Estructura de Datos: Colas en Java (Estática, Circular y Dinámica)

## ¿Qué es una cola?

Una **cola** es una estructura de datos lineal que sigue el principio **FIFO** (*First In, First Out*): el primer elemento en entrar es el primero en salir, igual que la fila de una taquilla. Los elementos se agregan por el **fin** (`encolar`) y se extraen por el **frente** (`desencolar`).

```
 salen  <--  Frente -> [10] [20] [30] [40] <- Fin  <--  entran
```

## Las tres variantes

### 1. Cola estática lineal (`ColaEstatica`)
Se construye sobre un **arreglo de tamaño fijo** con dos índices, `frente` y `fin`, que solo avanzan. Es la versión más sencilla, pero tiene una limitación: al desencolar, las posiciones liberadas al inicio del arreglo **no se reutilizan**, así que la cola puede aparecer "llena" aunque tenga espacios libres.

### 2. Cola estática circular (`ColaEstaticaCircular`)
También usa un arreglo de tamaño fijo, pero los índices avanzan con aritmética modular (`(indice + 1) % capacidad`), de modo que al llegar al final **regresan al inicio** y reutilizan los espacios liberados. Un contador `tamano` distingue entre cola llena y vacía. Aprovecha toda la capacidad del arreglo.

### 3. Cola dinámica (`ColaDinamica`)
Se construye con **nodos enlazados** (`Nodo`): `frente` apunta al primer nodo y `fin` al último. **No tiene capacidad fija**; crece y decrece conforme se encola y desencola, limitada solo por la memoria disponible. Incluye `contarElementos()`, que recorre los nodos para obtener el total.

---

## Estructura del proyecto

```
src/Estructuras_Lineales/Unidad03y04/
├── ColaEstatica/
│   ├── ColaEstatica.java            # Cola lineal con arreglo (+ peek)
│   └── Main.java                    # Main de la cola estática
├── ColaEstaticaCircular/
│   ├── ColaEstaticaCircular.java    # Cola circular con arreglo (+ peek)
│   └── Main.java                    # Main de la cola circular
├── ColaDinamica/
│   ├── ColaDinamica.java            # Cola con nodos enlazados (+ peek, contarElementos)
│   └── Main.java                    # Main de la cola dinámica
└── PilaDinamica/
    └── Nodo.java                    # Nodo reutilizado de la práctica de Pilas
```

## Los tres Main (uno por variante)

| Variante | Main a ejecutar |
|---|---|
| Cola estática lineal | `Estructuras_Lineales.Unidad03y04.ColaEstatica.Main` |
| Cola estática circular | `Estructuras_Lineales.Unidad03y04.ColaEstaticaCircular.Main` |
| Cola dinámica | `Estructuras_Lineales.Unidad03y04.ColaDinamica.Main` |

Cada `Main` encola valores, consulta el frente con `peek()`, desencola, prueba los casos límite (cola llena o vacía) y muestra el resultado en consola.

## Cómo ejecutar

**Con IntelliJ IDEA:** abre el proyecto, entra al paquete de la cola que quieras probar, abre su `Main.java` y presiona el botón ▶.

**Con la terminal** (en la raíz del proyecto, con JDK instalado):

```bash
git clone https://github.com/Lalis-707/Estructura-de-Datos-Colas-Java.git
cd Estructura-de-Datos-Colas-Java

javac -encoding UTF-8 -d out $(find src -name "*.java")
java -cp out Estructuras_Lineales.Unidad03y04.ColaEstatica.Main
java -cp out Estructuras_Lineales.Unidad03y04.ColaEstaticaCircular.Main
java -cp out Estructuras_Lineales.Unidad03y04.ColaDinamica.Main
```

## Operaciones implementadas

| Operación | Descripción | Estática | Circular | Dinámica |
|---|---|:---:|:---:|:---:|
| `encolar(int x)` | Agrega un elemento al fin | * | * | * |
| `desencolar()` | Extrae y devuelve el elemento del frente | * | * | * |
| `peek()` | Consulta el frente **sin extraerlo** | * | * | * |
| `estaVacia()` | Indica si no hay elementos | * | * | * |
| `estaLlena()` | Indica si se agotó la capacidad | * | * | n/a |
| `mostrar()` | Imprime la cola de frente a fin | * | * | * |
| `contarElementos()` | Cuenta los nodos activos con un recorrido | n/a | n/a | * |

> Cuando se consulta o desencola una cola vacía, los métodos imprimen un aviso y devuelven `-1`.

## Comparación resumida

| Criterio | Estática lineal | Estática circular | Dinámica |
|---|---|---|---|
| Memoria | Arreglo fijo | Arreglo fijo | Nodos creados bajo demanda |
| Capacidad | Fija; se "llena" aun con huecos libres | Fija; se aprovecha por completo | Sin límite predefinido |
| Reutiliza espacio liberado | No | Sí (índices con módulo) | Sí (libera el nodo) |
| `encolar` / `desencolar` / `peek` | O(1) | O(1) | O(1) |
| Cuándo usarla | Flujo corto de un solo uso | Tamaño máximo conocido, uso continuo | Tamaño impredecible |
