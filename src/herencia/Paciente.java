
package herencia;

import java.util.Date;

public class Paciente extends Persona {
    private int idPaciente;
    private Date fechaRegistro;
    private boolean estaEnfermo;
    private static int contadorCliente;
    
    public Paciente(Date fechaRegistro, boolean estaEnfermo,
            String nombre, char genero, int edad, String descripcion){
        super(nombre, genero, edad, descripcion);
        this.idPaciente = ++Paciente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.estaEnfermo = estaEnfermo;
        
    }

    @Override
    public String escribirAlgo(String glosa) {
        return "C Paciente. @Override Escribiendo otra cosa "+glosa;
    }
    
    
    
    public int getIdPaciente(){
        return this.idPaciente;
    }
    
    public Date getFechaRegistro(){
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro){
        this.fechaRegistro = fechaRegistro;
    }
    
    public boolean getEstaEnfermo(){
        return this.estaEnfermo;
    }
    
    public void setEstaEnfermo(boolean estaEnfermo){
        this.estaEnfermo = estaEnfermo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paciente{idPaciente=").append(idPaciente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", estaEnfermo=").append(estaEnfermo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
}
