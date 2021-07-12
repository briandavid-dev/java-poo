
package claseabstractra;

public class Cuadrado extends FiguraGeometrica {

    public Cuadrado(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar() {
        System.out.println("Dibujando "+tipoFigura);
    }
    
    
}
