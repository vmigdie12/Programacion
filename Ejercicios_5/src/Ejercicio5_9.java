import java.util.Scanner;
public class Ejercicio5_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = s.nextInt();
        int j=1;
        
        while (num/10!=0){ 
            num=num/10;
            j++;
        }
        System.out.println("El numero tiene "+j+" digitos.");
        s.close();
    }
}