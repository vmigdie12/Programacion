import java.util.Scanner;
public class Ejercicio3_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen:");
        double nota1 = s.nextDouble();
        System.out.println("Introduce la nota deseada del trimestre:");
        double nota3 = s.nextDouble();
        double nota2 = nota1+((nota3-nota1)/0.6); 
        System.out.println("Para tener un "+nota3+" en el trimestre necesitas sacar un "+nota2+" en el segundo examen");
        s.close();
    }
}
