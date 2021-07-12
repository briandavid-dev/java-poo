package interfaces;

public class Consultas implements BaseDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar Consultas");
    }

    @Override
    public void listar() {
        System.out.println("listar Consultas");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar Consultas");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar Consultas");
    }

}