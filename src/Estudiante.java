public class Estudiante{
    private String nombre ;
    private int codigo ;
    private double nota ;

    //variabel estatica
    private static int totalEstudiantes = 0;
    // constructor

    public Estudiante (String  nombre , int codigo , double nota){
        this.nombre = nombre ;
        this.codigo = codigo ;
        this.nota = nota ;
        totalEstudiantes++;
    }

    //getter y setter
    public String getNombre(){
        return  nombre;
    }
    public  double  getNota(){
        return  nota;
    }

    //metodo static
    public static int getTotalEstudiantes () {
        return  totalEstudiantes;
    }
    //metodo 
    public void mostrarInfo( ){
        System.out.println("Estudiantes : " + nombre + " nota: " + nota);
    }

}