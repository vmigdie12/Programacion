package AUnidimensionales;
public class Ejercicio7_12 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] numeros1 = new int[10];
        for (int i = 0; i<10;i++){
            System.out.print("Introduce un numero: ");
            numeros[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Array inicial: ");
        for (int i = 0; i<10;i++){
            System.out.print(numeros[i]+ " ");
        }
        System.out.println("");
        System.out.print("Introduce la posicion inicial: ");
        int p1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce la posicion final: ");
        int p2 = Integer.parseInt(System.console().readLine());
        if (p2<p1){
            System.out.println("La posicion final tiene que ser mayor a la inicial");
        }
        if (p2==p1){
            System.out.println("Las posiciones inicial y final no pueden ser iguales");
        }
        if (p2>p1){
            System.out.println("Array final: ");
            numeros1[p2] = numeros[p1];
            for (int i = 0; i<10;i++){
                if (i<=p1)
                    if (i==0)
                        numeros1[0]= numeros[9];
                    else if(i!=0)
                        numeros1[i]= numeros[i-1];
                if (i>p2)
                    numeros1[i]= numeros[i-1];
                if (i>p1&&i<p2){
                    numeros1[i]= numeros[i];
                }
            }
            for (int i = 0; i<10;i++){
                System.out.print(numeros1[i]+ " ");
            }
        }
    }
}