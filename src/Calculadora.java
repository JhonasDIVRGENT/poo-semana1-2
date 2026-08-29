public class Calculadora {
    private String historial ; 
    private static  int totalOperaciones = 0 ;
    
    public Calculadora () {
        this.historial = "" ; 


    }
    

    // sobrecarga del metodo sumar

    public int sumar (int a , int b){
        int resultado = a +b ; 
        totalOperaciones = a+b ; 
        totalOperaciones ++;
        historial += a + "+" + b + "="+ resultado + "\n";
        return  resultado ;
    }

    public int sumar (int a , int b , int c){
        return  sumar (a , b)+ c ;  
    }

    public  static  int getTotalOperaciones() {
        return  totalOperaciones;
    }
    public void mostrarHistorial (){
        System.out.println(historial);
    }
}
