package clases;

public class Calculadora {
    
    public static final String METODO = "Calculadora";
    int numero = 10;
    String glosa = "Hola";
    
    // Sobrecarga de metodos
    public static int sumar(int a, int b){
        return a + b;
    }
    public static double sumar(int a, int b, double c){
        return a + b + c;
    }
    public static double sumar(double a, double b){
        return a + b;
    }

    // Sobrecarga de constructores
    public Calculadora(){
        System.out.println("Constructor 1");
        metodo1();
    }
    public Calculadora(int numero){
        System.out.println("Constructor "+numero);
    }
    public Calculadora(String numero){
        System.out.println("Constructor "+numero);
    }
    public Calculadora(double dou){
        System.out.println("Constructor "+dou);
    }
    
    void metodo1() {
        this.numero = 14;
        System.out.println(numero);
    }
}
