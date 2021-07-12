package interfaces;

public class Usuarios implements BaseDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar Usuarios");
    }

    @Override
    public void listar() {
        System.out.println("listar Usuarios");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar Usuarios");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar Usuarios");
    }
    
    
    
}