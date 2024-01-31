import java.util.Scanner;

public class Ejercicio3_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el precio del producto: ");
        double precio = s.nextInt();
        Double iva = 0.21;
        System.out.println("Base imponible: " + precio );
        System.out.println("IVA: " + precio*iva );
        System.out.println("Total: " + (precio+precio*iva) );
        s.close();
    }
}