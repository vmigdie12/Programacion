import java.util.Scanner;

public class Ejercicio3_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double conversion = 166.386;
        System.out.println("Introduce la cantidad de euros que quieres convertir a pesetas: ");
        int euros = s.nextInt();
        System.out.println(euros+ " euros son "+ euros*conversion+ " pesetas");
        s.close();
    }
}
