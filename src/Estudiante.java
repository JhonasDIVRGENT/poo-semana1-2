public class Estudiante {
    private String nombre;
    private int codigo;
    private double nota;
    private static int totalEstudiantes = 0;

    public Estudiante(String nombre, int codigo, double nota) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nota = nota;
        totalEstudiantes++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getNota() {
        return nota;
    }

    public static int getTotalEstudiantes() {
        return totalEstudiantes;
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + ", codigo: " + codigo + ", nota: " + nota);
    }
}