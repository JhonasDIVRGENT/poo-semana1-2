public class App {
    public static void main(String[] args) {
        System.out.println("=== Demo de Calculadora ===");
        Calculadora calculadora = new Calculadora();

        int suma1 = calculadora.sumar(5, 3);
        int suma2 = calculadora.sumar(10, 2, 4);

        System.out.println("Resultado 5 + 3 = " + suma1);
        System.out.println("Resultado 10 + 2 + 4 = " + suma2);
        System.out.println("Total de operaciones: " + Calculadora.getTotalOperaciones());
        calculadora.mostrarHistorial();

        System.out.println();
        System.out.println("=== Demo de Estudiante ===");
        Estudiante estudiante1 = new Estudiante("Ana", 101, 17.5);
        Estudiante estudiante2 = new Estudiante("Luis", 102, 18.0);

        estudiante1.mostrarInfo();
        estudiante2.mostrarInfo();
        System.out.println("Total de estudiantes: " + Estudiante.getTotalEstudiantes());
    }
}
