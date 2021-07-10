package herencia;


public class Medico extends Persona {
    private int idMedico;
    private double sueldo;
    private static int contadorEmpleado;

    public Medico(double sueldo, String nombre){
        super(nombre);
        this.idMedico = ++Medico.contadorEmpleado;
        this.sueldo = sueldo;
    }

    @Override
    public String escribirAlgo(String glosa) {
        return "C Médico. @Override. escribirAlgo PO "+glosa;
    }
    
    

    public int getIdMedico() {
        return idMedico;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Medico{" + "idMedico=" + this.idMedico + ", sueldo=" + this.sueldo + ", Persona: "+ super.toString() + '}';
    }

  
    
    
}
