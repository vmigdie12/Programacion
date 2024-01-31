package AUnidimensionales;
public class Ejercicio7_16 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        for(int i = 0; i<20;i++){
            numeros[i] = (int)(Math.random()*401);
            System.out.print(numeros[i]+" ");
        }
        System.out.println(" ");
        System.out.print("¿Qué números quiere resaltar? (1 - los múltiplos de 5, 2 - los múltiplos de 7): ");
        int pregunta = Integer.parseInt(System.console().readLine());
        if (pregunta == 1){
            for(int i = 0; i<20;i++){
                if (numeros[i]%5==0)
                    System.out.print("["+ numeros[i]+"] ");
                if (numeros[i]%5!=0)
                    System.out.print(numeros[i]+" ");
            }
        }
        if (pregunta == 2){
            for(int i = 0; i<20;i++){
                if (numeros[i]%7==0)
                    System.out.print("["+ numeros[i]+"] ");
                if (numeros[i]%7!=0)
                    System.out.print(numeros[i]+" ");
            }
        }
    }
}
