package encapsulamiento;

public class ConsultaMedica {
    
    private String motivo;
    private String fecha;
    private int tipo;
    private boolean activada;

    public ConsultaMedica(String motivo, String fecha, int tipo, boolean activada){
        this.motivo = motivo;
        this.fecha = fecha;
        this.tipo = tipo;
        this.activada = activada;
    }
    
    public String getMotivo(){
        return motivo;
    }
    public void setMotivo(String motivo){
        this.motivo = motivo;
    }
    
    public String getFecha(){
        return this.fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    
    public int getTipo(){
        return this.tipo;
    }
    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    
    public boolean isActivada(){
        return this.activada;
    }
    public void setActivada(boolean activada){
        this.activada = activada;
    }

    @Override
    public String toString() {
        return "Consulta Medica: [Motivo: %s, Fecha: %s, Tipo: %d, Activada: %b]"
                .formatted(this.motivo, getFecha(), this.tipo, this.activada); 
    }
    
    
    
}
