package AUnidimensionales;
public class Ejercicio7_9 {
    public static void main(String[] args) {
        int[] numeros = new int[9];
        System.out.println("Introduce un 9 numeros enteros: ");
        for (int i = 0; i<=8;i++){
            numeros[i]=Integer.parseInt(System.console().readLine());
        }
        for (int i = 0; i<=8;i++){
            System.out.print(numeros[i]);
            if (numeros[i]%2==0){
                System.out.println(" par");
            }
            if (numeros[i]%2!=0){
                System.out.println(" impar");
            }
        }
    }
}
