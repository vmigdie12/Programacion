import java.util.Scanner;

public class Ejercicio3_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe la base de un rectangulo: ");
        int a = s.nextInt();
        System.out.println("Escribe la altura de un rectangulo: ");
        int b = s.nextInt();
        System.out.println("El area de el rectangulo es: "+a+ " * "+ b+ " = "+(a*b));
        s.close();
    }
}