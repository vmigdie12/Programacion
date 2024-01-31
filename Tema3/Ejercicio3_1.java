import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num1 = s.nextInt();
        System.out.println("Introduce otro numero: ");
        int num2 = s.nextInt();
        System.out.println(num1+" * "+ num2 +" = "+num1*num2);
        s.close();
    }
}
