public class SistemaContable {

    //Atributos
    private String nombreEmpresa;
    private String ruc;
    private double ingresos;
    private double egresos;
    private double saldo;

    private static int totalRegistros = 0;

    //Constructor
    public SistemaContable(String nombreEmpresa, String ruc, double ingresos, double egresos) {
    this.nombreEmpresa = nombreEmpresa;
    this.ruc = ruc;
    this.ingresos = ingresos;
    this.egresos = egresos;
    this.saldo = ingresos - egresos;
    totalRegistros++;
}

// Getter de nombreEmpresa
public String getNombreEmpresa() {
    return nombreEmpresa;
}

// Setter de nombreEmpresa
public void setNombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
}

// Getter y Setter de RUC
public String getRuc() {
    return ruc;
}

public void setRuc(String ruc) {
    this.ruc = ruc;
}

// Getter y Setter de ingresos
public double getIngresos() {
    return ingresos;
}

public void setIngresos(double ingresos) {
    this.ingresos = ingresos;
    this.saldo = this.ingresos - this.egresos;
}

// Getter y Setter de egresos
public double getEgresos() {
    return egresos;
}

public void setEgresos(double egresos) {
    this.egresos = egresos;
    this.saldo = this.ingresos - this.egresos;
}

// Getter de saldo
public double getSaldo() {
    return saldo;
}

// Getter del total de registros
public static int getTotalRegistros() {
    return totalRegistros;
}   
} 
