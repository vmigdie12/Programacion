package AUnidimensionales;
public class Ejercicio7_10 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        for (int i =0;i<= 19;i++){
            numeros[i]= (int)(Math.random()*100);
        }
        System.out.println("Numeros generados (primero pares y despues impares): ");
        for (int i =0;i<= 19;i++){
            if (numeros[i]%2==0)
            System.out.print(numeros[i]+" ");
        }
        for (int i =0;i<= 19;i++){
            if (numeros[i]%2!=0)
            System.out.print(numeros[i]+" ");
        }
    }
}
