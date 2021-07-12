package bloque.codigo;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    static {
        System.out.println("Ejecutando static");
        // solo se puede asignar atributos estaticos
        ++Persona.contadorPersona;
    }

    {
        System.out.println("Ejecutando dinamic");
        this.idPersona = Persona.contadorPersona;
    }    
    
    public Persona() {
        System.out.println("Ejecutando constructor Persona");
    }
    
    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }

    

    
    
    
    
}