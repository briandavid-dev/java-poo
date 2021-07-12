
package claseabstractra;

public class Triangulo extends FiguraGeometrica {
    public Triangulo(String tipoFigura){
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujar "+ tipoFigura);
    }
    
    
}
