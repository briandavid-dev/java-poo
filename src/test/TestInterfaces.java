package test;

import interfaces.BaseDatos;
import interfaces.Consultas;
import interfaces.Usuarios;

public class TestInterfaces {
    public static void main(String[] args){
        
        BaseDatos bd1 = new Usuarios();
        bd1.eliminar();
        
        Usuarios usu = new Usuarios();
        usu.listar();
        
        BaseDatos bd2 = new Consultas();
        bd2.insertar();
        
        Consultas con = new Consultas();
        con.actualizar();
        
        
    }
}