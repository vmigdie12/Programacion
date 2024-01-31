package AUnidimensionales;
public class Ejercicio7_11 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] primo= new int[10];
        int[] noprimo = new int [10];
        int contador =0;
        int contadorpi=0;
        int k = 0;
        int l =0;
        for (int i =0;i<= 9;i++){
            numeros[i]= Integer.parseInt(System.console().readLine());
        }
        for (int i =0;i<=9;i++){
            contador = 0;
            for (int j=1; j<=1000;j++){
                if (numeros[i]%j==0){
                    contador++;
                }
            }
            if (contador==2){
                primo[k] = numeros[i];
                k++;
                contadorpi++;
            }
            if (contador!=2){
                noprimo[l] = numeros[i];
                l++;
            }
        }
        System.out.println("Array inicial: ");
        for (int i =0;i<= 9;i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        for (int i =0;i<= 9;i++){
            System.out.print(numeros[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Array final: ");
        for (int i =0;i<= 9;i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");

        for (int i =0;i<contadorpi;i++){
            System.out.print(primo[i]+" ");
        }
        for (int i =0;i<=9-contadorpi;i++){
            System.out.print(noprimo[i]+" ");
        }
    }
}
