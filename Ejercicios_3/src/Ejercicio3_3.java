import java.util.Scanner;

public class Ejercicio3_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double conversion = 166.386;
        System.out.println("Introduce la cantidad de pesetas que quieres convertir a euros: ");
        int pesetas = s.nextInt();
        System.out.println(pesetas+ " pesetas son "+ pesetas/conversion+ " euros");
        s.close();
    }
}