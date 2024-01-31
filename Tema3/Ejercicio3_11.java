import java.util.Scanner;

public class Ejercicio3_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double conversion = 1000;
        System.out.println("Conversor de Mb a Kb: ");
        int Kb = s.nextInt();
        System.out.println(Kb+ " Kb son "+ Kb/conversion+ " Mb");
        s.close();
    }
}
