package test;
import herencia.*;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args){
        
        Persona persona = new Persona("Maria Fernanda", 'F', 30, "Mujer linda que me gusta");
        imprimir(persona);
        
        Paciente paciente = new Paciente(new Date(), true, "Maria", 'F', 30, "Paciente con caso de COVID");
        imprimir(paciente);
        
        Medico medico = new Medico(2000000, "David Brian Ochoa");
        TestHerencia.imprimir(medico);
        
        
    }
    
    public static void imprimir(Persona persona){
        System.out.println(persona);
        System.out.println(persona.escribirAlgo("1"));
        determinarTipo(persona);
        System.out.println("");
    }
    
    public static void imprimir(Paciente paciente){
        System.out.println(paciente);
        System.out.println(paciente.escribirAlgo("2"));
        determinarTipo(paciente);
        System.out.println("");
    }
    
    public static void imprimir(Medico medico){
        medico.setEdad(32);
        medico.setGenero('F');
        medico.setDescripcion("Paciene guapo bb");
        System.out.println(medico);
        System.out.println(medico.escribirAlgo("33"));
        determinarTipo(medico);
        System.out.println("");
    }
    
    public static void determinarTipo(Object object){
        if(object instanceof Medico){
            System.out.println("Objeto Tipo medico");
        } else if(object instanceof Paciente){
            System.out.println("Objeto Tipo paciente");
        } else if(object instanceof Persona){
            System.out.println("Objeto Tipo persona");
        } else if(object instanceof Object){
            System.out.println("Objeto Tipo Object");
        }
        
        
    }
    
    
}
