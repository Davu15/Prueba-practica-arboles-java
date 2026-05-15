package src.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);

        ArbolBinario arbol = new ArbolBinario();

        int opcion;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Insertar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Recorrido Inorden");
            System.out.println("4. Recorrido Preorden");
            System.out.println("5. Recorrido Postorden");
            System.out.println("6. Recorrido BFS");
            System.out.println("7. Contar estudiantes");
            System.out.println("8. Altura del arbol");
            System.out.println("9. Salir");

            System.out.print("Ingrese una opcion: ");
            opcion = datos.nextInt();
            datos.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Cedula: ");
                    String cedula = datos.nextLine();

                    System.out.print("Apellidos: ");
                    String apellidos = datos.nextLine();

                    System.out.print("Nombres: ");
                    String nombres = datos.nextLine();

                    System.out.print("Nota Final: ");
                    double nota = datos.nextDouble();
                    datos.nextLine();

                    System.out.print("Carrera: ");
                    String carrera = datos.nextLine();

                    System.out.print("Nivel: ");
                    int nivel = datos.nextInt();

                    Estudiante estudiante = new Estudiante(
                            cedula,
                            apellidos,
                            nombres,
                            nota,
                            carrera,
                            nivel
                    );

                    arbol.insertarEstudiante(estudiante);

                    System.out.println("Estudiante insertado correctamente");
                    break;

                case 2:

                    System.out.print("Ingrese cedula: ");
                    String buscar = datos.nextLine();

                    Estudiante encontrado = arbol.buscarEstudiante(buscar);

                    if (encontrado != null) {
                        encontrado.mostrarDatos();
                    } else {
                        System.out.println("Estudiante no encontrado");
                    }

                    break;

                case 3:
                    arbol.recorridoInorden();
                    break;

                case 4:
                    arbol.recorridoPreorden();
                    break;

                case 5:
                    arbol.recorridoPostorden();
                    break;

                case 6:
                    arbol.recorridoPorNiveles();
                    break;

                case 7:
                    System.out.println("Total estudiantes: "
                            + arbol.contarNodos());
                    break;

                case 8:
                    System.out.println("Altura del arbol: "
                            + arbol.calcularAltura());
                    break;

                case 9:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 9);
    }
}