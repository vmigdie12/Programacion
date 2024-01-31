import java.util.Scanner;

public class Ejercicio3_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe el radio del cono: ");
        double r = s.nextInt();
        System.out.println("Escribe la altura del cono: ");
        double h = s.nextInt();
        double v = 1.0/3*3.14159265359*r*r*h;
        System.out.println("El volumen del cono  es: "+v);
        s.close();
    }
}   