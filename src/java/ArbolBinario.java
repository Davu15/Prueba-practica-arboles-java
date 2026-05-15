package src.java;
import java.util.LinkedList;
import java.util.Queue;

public class ArbolBinario {

    Nodo raiz;

    // INSERTAR
    public void insertarEstudiante(Estudiante estudiante) {
        raiz = insertarRecursivo(raiz, estudiante);
    }

    private Nodo insertarRecursivo(Nodo actual, Estudiante estudiante) {

        if (actual == null) {
            return new Nodo(estudiante);
        }

        if (estudiante.cedula.compareTo(actual.estudiante.cedula) < 0) {
            actual.izquierda = insertarRecursivo(actual.izquierda, estudiante);
        } else {
            actual.derecha = insertarRecursivo(actual.derecha, estudiante);
        }

        return actual;
    }

    // BUSCAR
    public Estudiante buscarEstudiante(String cedula) {

        Nodo encontrado = buscarRecursivo(raiz, cedula);

        if (encontrado != null) {
            return encontrado.estudiante;
        }

        return null;
    }

    private Nodo buscarRecursivo(Nodo actual, String cedula) {

        if (actual == null) {
            return null;
        }

        if (actual.estudiante.cedula.equals(cedula)) {
            return actual;
        }

        if (cedula.compareTo(actual.estudiante.cedula) < 0) {
            return buscarRecursivo(actual.izquierda, cedula);
        } else {
            return buscarRecursivo(actual.derecha, cedula);
        }
    }

    // RECORRIDO INORDEN
    public void recorridoInorden() {
        inorden(raiz);
    }

    private void inorden(Nodo actual) {

        if (actual != null) {

            inorden(actual.izquierda);
            actual.estudiante.mostrarDatos();
            inorden(actual.derecha);
        }
    }

    // PREORDEN
    public void recorridoPreorden() {
        preorden(raiz);
    }

    private void preorden(Nodo actual) {

        if (actual != null) {

            actual.estudiante.mostrarDatos();
            preorden(actual.izquierda);
            preorden(actual.derecha);
        }
    }

    // POSTORDEN
    public void recorridoPostorden() {
        postorden(raiz);
    }

    private void postorden(Nodo actual) {

        if (actual != null) {

            postorden(actual.izquierda);
            postorden(actual.derecha);
            actual.estudiante.mostrarDatos();
        }
    }

    // BFS
    public void recorridoPorNiveles() {

        if (raiz == null) {
            return;
        }

        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);

        while (!cola.isEmpty()) {

            Nodo actual = cola.poll();

            actual.estudiante.mostrarDatos();

            if (actual.izquierda != null) {
                cola.add(actual.izquierda);
            }

            if (actual.derecha != null) {
                cola.add(actual.derecha);
            }
        }
    }

    // CONTAR NODOS
    public int contarNodos() {
        return contar(raiz);
    }

    private int contar(Nodo actual) {

        if (actual == null) {
            return 0;
        }

        return 1 + contar(actual.izquierda) + contar(actual.derecha);
    }

    // ALTURA
    public int calcularAltura() {
        return altura(raiz);
    }

    private int altura(Nodo actual) {

        if (actual == null) {
            return 0;
        }

        int izquierda = altura(actual.izquierda);
        int derecha = altura(actual.derecha);

        return Math.max(izquierda, derecha) + 1;
    }
}