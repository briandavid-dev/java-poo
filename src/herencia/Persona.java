package herencia;

public class Persona {
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String descripcion;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String descripcion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.descripcion = descripcion;
    }
    
    public String escribirAlgo(String glosa) {
        return "C Persona. Escribiste: "+glosa;
    }
    
    

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", descripcion=").append(descripcion);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
