package test;
import clases.Persona;

public class CompareObjects {
    public static void main(String [] args){
        Persona p1 = new Persona("David", 32);
        Persona p2 = new Persona("David", 32);
        
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        
        System.out.println(p1.hashCode() == p2.hashCode());
        
        
        
        
    }
}