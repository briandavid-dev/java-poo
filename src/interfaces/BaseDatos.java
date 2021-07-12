package interfaces;

public interface BaseDatos {
    int MAXIMO_DATOS = 100;
    
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
}