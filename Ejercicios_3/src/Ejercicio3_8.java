import java.util.Scanner;

public class Ejercicio3_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce las horas trabajadas esta semana: ");
        int horas = s.nextInt();
        System.out.println("Tu salario de esta semana es: " + horas*12 );
        s.close();
    }
}