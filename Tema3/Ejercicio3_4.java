import java.util.Scanner;

public class Ejercicio3_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int a = s.nextInt();
        System.out.println("Escribe otro numero: ");
        int b = s.nextInt();
        System.out.println(a+ " + "+ b+ " = "+(a+b));
        System.out.println(a+ " - "+ b+ " = "+(a-b));
        System.out.println(a+ " * "+ b+ " = "+(a*b));
        System.out.println(a+ " / "+ b+ " = "+(a/b));
        s.close();
    }
}
