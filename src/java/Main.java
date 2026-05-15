import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);

        ArbolBinario arbol = new ArbolBinario();

        int opcion;

        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Insertar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Recorrido Inorden");
            System.out.println("5. Recorrido Preorden");
            System.out.println("6. Recorrido Postorden");
            System.out.println("7. Recorrido BFS");
            System.out.println("8. Contar estudiantes");
            System.out.println("9. Altura del arbol");
            System.out.println("10. Mayor nota");
            System.out.println("11. Menor nota");
            System.out.println("12. Mostrar aprobados");
            System.out.println("13. Mostrar reprobados");
            System.out.println("14. Salir");

            System.out.print("Seleccione una opcion: ");

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

                    Estudiante estudiante =
                            new Estudiante(
                                    cedula,
                                    apellidos,
                                    nombres,
                                    nota,
                                    carrera,
                                    nivel
                            );

                    arbol.insertarEstudiante(estudiante);

                    System.out.println("Estudiante insertado");
                    break;

                case 2:

                    System.out.print("Ingrese cedula: ");

                    String buscar = datos.nextLine();

                    Estudiante encontrado =
                            arbol.buscarEstudiante(buscar);

                    if (encontrado != null) {

                        encontrado.mostrarDatos();

                    } else {

                        System.out.println("No encontrado");
                    }

                    break;

                case 3:

                    System.out.print("Cedula a eliminar: ");

                    String eliminar = datos.nextLine();

                    arbol.eliminarEstudiante(eliminar);

                    System.out.println("Estudiante eliminado");

                    break;

                case 4:

                    arbol.recorridoInorden();

                    break;

                case 5:

                    arbol.recorridoPreorden();

                    break;

                case 6:

                    arbol.recorridoPostorden();

                    break;

                case 7:

                    arbol.recorridoPorNiveles();

                    break;

                case 8:

                    System.out.println("Total estudiantes: "
                            + arbol.contarNodos());

                    break;

                case 9:

                    System.out.println("Altura: "
                            + arbol.calcularAltura());

                    break;

                case 10:

                    System.out.println("Mayor nota:");

                    arbol.buscarNotaMayor().mostrarDatos();

                    break;

                case 11:

                    System.out.println("Menor nota:");

                    arbol.buscarNotaMenor().mostrarDatos();

                    break;

                case 12:

                    System.out.println("ESTUDIANTES APROBADOS");

                    arbol.mostrarAprobados();

                    break;

                case 13:

                    System.out.println("ESTUDIANTES REPROBADOS");

                    arbol.mostrarReprobados();

                    break;

                case 14:

                    System.out.println("Fin del programa");

                    break;

                default:

                    System.out.println("Opcion invalida");
            }

        } while (opcion != 14);
    }
}