package test;
import claseabstractra.*;

public class TestClaseAbstracta {
    public static void main(String[] args) {
        
        FiguraGeometrica fg = new Triangulo("Triangulo A");
        fg.dibujar();
        
        Triangulo t = new Triangulo("Triangulo B");
        t.dibujar();
        
        FiguraGeometrica figura = new Cuadrado("Cuadrado A");
        figura.dibujar();
        
    }
}
