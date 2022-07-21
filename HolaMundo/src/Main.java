import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        String nombre;

        System.out.println("Ingrese su nombre");
        nombre=entrada.next();
        System.out.println("Bienvenido a programacion 2 2022: "+nombre);
    }
}