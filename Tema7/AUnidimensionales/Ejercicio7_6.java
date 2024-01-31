package AUnidimensionales;
public class Ejercicio7_6 {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        int[] numeros1 = new int[15];
        for (int i = 0; i<15;i++){
            numeros[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Array original: ");
        for (int i = 0; i<15;i++){
            System.out.print(numeros[i]+ " ");
        }
        System.out.println("");
        System.out.println("Array rotado: ");
        for (int i = 0; i<15;i++){
            if (i==0){
                numeros1[0] = numeros[14];
            }
            else 
            numeros1[i]= numeros[i-1];
        }
        for (int i = 0; i<15;i++){
            System.out.print(numeros1[i]+ " ");
        }
    }
}