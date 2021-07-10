package poo;

import clases.Calculadora;
import encapsulamiento.ConsultaMedica;
import herencia.Persona;
import static java.lang.Math.*;


public class Poo {

    public static void main(String[] args) {
        // TODO code application logic here
        // Persona persona1 = new Persona();        
        // persona1.nombre = "Fernanda";
        // persona1.edad = 31;
        // persona1.muestraDatosPersonales();
        
        // Persona persona2 = new Persona();
        // persona2.nombre = "Brian";
        // persona2.edad = 33;
        // persona2.muestraDatosPersonales();
        
        /// System.out.println(Calculadora.METODO);
        /// System.out.println(Calculadora.sumar(4, 10));
        /// System.out.println(Calculadora.sumar(4, 10, 5.72));
        /// System.out.println(Calculadora.sumar(1.1, 2.9));
        
        /// System.out.println("");
        /// System.out.println(PI);
        /// System.out.println(pow(5, 3));
        
        /// System.out.println("");
        /// new Calculadora();
        /// new Calculadora(1);
        /// new Calculadora("1");
        /// new Calculadora(1.5);
        /*
        ConsultaMedica consultaMedica = new ConsultaMedica("Dolor de espalda","08-07-2021",1,true);
        System.out.println(consultaMedica.isActivada());
        System.out.println(consultaMedica.getMotivo());
        System.out.println(consultaMedica);
        
        System.out.println("");
        consultaMedica.setMotivo("Mano arqueada");
        consultaMedica.setActivada(false);
        System.out.println(consultaMedica.isActivada());
        System.out.println(consultaMedica.getMotivo());
        
        System.out.println("");        
        System.out.println(consultaMedica);
        */
        
        Persona per = new Persona("Brian");
        System.out.println(per);
    }
    
}
