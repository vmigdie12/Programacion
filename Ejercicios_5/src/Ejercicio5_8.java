import java.util.Scanner;
public class Ejercicio5_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = s.nextInt();
        int f;
        for(int i=0; i<=10; i++){
            f=num*i;
            System.out.println(num+" * "+i+" = "+f);
        }
        s.close();
    }
}
