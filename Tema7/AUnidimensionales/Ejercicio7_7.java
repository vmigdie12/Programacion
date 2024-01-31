package AUnidimensionales;
public class Ejercicio7_7 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int i = 0; i<=99;i++){
            numeros[i] = (int)(Math.random()*20);
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
        System.out.print("Introduce un valor que quieras cambiar: ");
        int valor1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el valor por el que quieras cambiarlo: ");
        int valor2 = Integer.parseInt(System.console().readLine());
        System.out.println("");
        for (int i = 0; i<=99;i++){
            if (numeros[i]!=valor1)
            System.out.print(numeros[i]+" ");
            if (numeros[i]==valor1)
            System.out.print("'"+valor2+"' ");
        }
    }
}
