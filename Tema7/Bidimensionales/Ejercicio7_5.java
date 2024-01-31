package Bidimensionales;
public class Ejercicio7_5 {
    public static void main(String[] args) {
        int[][] numeros = new int[6][10];
        int maximo=0;
        int minimo=1000;
        int filamax=0;
        int filamin=0;
        int columnamax=0;
        int columnamin=0;
        for (int fila=0; fila<6;fila++){
            System.out.print("Fila: "+ fila+ "     ");
            for (int columna=0;columna<10;columna++){
                numeros[fila][columna]=(int)(Math.random()*1001);
                if (numeros[fila][columna]>maximo){
                    maximo=numeros[fila][columna];
                    filamax=fila;
                    columnamax=columna;
                }
                if (numeros[fila][columna]<minimo){
                    minimo=numeros[fila][columna];
                    filamin=fila;
                    columnamin=columna;
                }
                System.out.print(numeros[fila][columna]+ " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("La posicion del maximo generado es: ");
        System.out.println("Fila: "+ filamax+"  Columna: "+ (columnamax+1));
        System.out.println("La posicion del minimo generado es: ");
        System.out.println("Fila: "+ filamin+"  Columna: "+ (columnamin+1));
    }
}
