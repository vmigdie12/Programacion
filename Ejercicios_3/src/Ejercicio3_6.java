import java.util.Scanner;

public class Ejercicio3_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe la base de un triangulo: ");
        int a = s.nextInt();
        System.out.println("Escribe la altura de un triangulo: ");
        int b = s.nextInt();
        System.out.println("El area de el rectangulo es: ("+a+ " * "+ b+ ") / "+"2"+" = "+(a*b/2));
        s.close();
    }
}