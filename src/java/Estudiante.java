public class Estudiante {

    String cedula;
    String apellidos;
    String nombres;
    double notaFinal;
    String carrera;
    int nivel;

    public Estudiante(String cedula, String apellidos, String nombres,
                       double notaFinal, String carrera, int nivel) {

        this.cedula = cedula;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.notaFinal = notaFinal;
        this.carrera = carrera;
        this.nivel = nivel;
    }

    public void mostrarDatos() {

        System.out.println("Cedula: " + cedula);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Nombres: " + nombres);
        System.out.println("Nota Final: " + notaFinal);
        System.out.println("Carrera: " + carrera);
        System.out.println("Nivel: " + nivel);
        System.out.println("--------------------------------");
    }
}