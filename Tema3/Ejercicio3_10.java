import java.util.Scanner;

public class Ejercicio3_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double conversion = 1000;
        System.out.println("Conversor de Mb a Kb: ");
        int Mb = s.nextInt();
        System.out.println(Mb+ " Mb son "+ Mb*conversion+ " Kb");
        s.close();
    }
}
