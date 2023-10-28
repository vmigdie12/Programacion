import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el valor de a: ");
        int a = sc.nextInt();
        System.out.println("Escriba el valor de b: ");
        int b= sc.nextInt();
        int c= a+b;
        System.out.println("a + b: "+c);
        sc.close();
    }
}
