import java.util.Scanner;
public class Ejercicio5_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for(int a=1; a<=4; a++){
            System.out.print("Introduce la combinacion de la caja fuerte: ");
            int comb = s.nextInt();
            if (comb == 1234){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            }else{
                System.out.println("Lo siento, esa no es la combinación");
            }
        }
    s.close();
    }
}
