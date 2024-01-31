package Bidimensionales;
public class Ejercicio7_3 {
    public static void main(String[] args) {
        int[][] calculo = new int[4][5];
        int sumatotal =0;
        int sumafila = 0;
        int sumacolumna=0;
        System.out.println("Introduce numeros: ");
        for (int fila=0; fila<4; fila++){
            for (int columna =0; columna <5;columna++){
                calculo[fila][columna]=(int)(Math.random()*900+100);
                sumatotal= calculo[fila][columna]+sumatotal;
            }
        }
        System.out.println(" ");
        for (int fila=0; fila<4; fila++){
            System.out.print("Fila: "+ fila+"     ");
            for (int columna =0; columna <5;columna++){
                System.out.print(calculo[fila][columna]+" ");
                sumafila = calculo[fila][columna]+ sumafila;
            }
            System.out.println("  Suma fila: "+sumafila);
            sumafila=0;
        }
        for (int columna=0; columna<5; columna++){
            for (int fila =0; fila <4;fila++){
                sumacolumna=calculo[fila][columna]+sumacolumna;
            }
            System.out.print("Suma col:"+sumacolumna+" ");
            sumacolumna=0;
        }
        System.out.print("Suma total:"+ sumatotal);
    }
}