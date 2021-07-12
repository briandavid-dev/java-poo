package test;

import clases.Persona;
import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args){
        Persona p1 = new Persona("Brian", 12);
        Persona p2 = new Persona("David", 42);
        Persona p3 = new Persona("Ochoa", 32);
        
        ArrayList<String> meses = new ArrayList<>();
        meses.add("Enero");
        meses.add("FEBRERO");
        System.out.println(meses);
        meses.forEach(mes -> {
            System.out.println(mes);    
        });
        System.out.println();
        
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p2);
        personas.add(p3);
        System.out.println(personas);
        personas.forEach(persona -> {
            System.out.println(persona.nombre+" "+persona.edad);
        });
        
        
    }
}