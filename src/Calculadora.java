public class Calculadora {
    private String historial;
    private static int totalOperaciones = 0;

    public Calculadora() {
        this.historial = "";
    }

    public int sumar(int a, int b) {
        int resultado = a + b;
        totalOperaciones++;
        historial += a + "+" + b + "=" + resultado + "\n";
        return resultado;
    }

    public int sumar(int a, int b, int c) {
        return sumar(a, b) + c;
    }

    public static int getTotalOperaciones() {
        return totalOperaciones;
    }

    public void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("No hay operaciones realizadas.");
        } else {
            System.out.println("Historial:");
            System.out.print(historial);
        }
    }
}
