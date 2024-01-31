package Bidimensionales;
public class Ejercicio7_9 {
    public static void rotarMatriz90(int[][] matriz) {

        int tamanio = matriz.length;
        int[][] nuevamatriz = new int[tamanio][tamanio];
    
        for (int x=0;x<tamanio;x++) {
            for (int y=0;y<tamanio;y++) {
                nuevamatriz[y][tamanio-1-x] = matriz[x][y];
            }
        }
        for (int fila=0;fila<12;fila++){
            if (fila<10)
                System.out.print("Fila: "+fila+"     ");
            if (fila>9)
                System.out.print("Fila: "+fila+"    ");
            for (int columna =0; columna<12;columna++){
                System.out.print(nuevamatriz[fila][columna]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[][] numeros = new int[12][12];
        System.out.println("Array original");
        for (int fila=0;fila<12;fila++){
            if (fila<10)
                System.out.print("Fila: "+fila+"     ");
            if (fila>9)
                System.out.print("Fila: "+fila+"    ");
            for (int columna =0; columna<12;columna++){
                numeros[fila][columna]=(int)(Math.random()*101);
                System.out.print(numeros[fila][columna]+" ");
            }
            System.out.println("");
        }
        System.out.println("Array rotado");
        rotarMatriz90(numeros);
    }
}
