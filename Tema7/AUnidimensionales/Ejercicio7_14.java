package AUnidimensionales;
public class Ejercicio7_14 {
    public static void main(String[] args) {
        String[] colores = new String[9];
        String[] palabras = new String[8];
        String[] palabras1 = new String[8];
        int a =0;
        int h = 0;
        int contador = 0;
        colores[0] = "verde";
        colores[1] = "rojo";
        colores[2] = "azul";
        colores[3] = "amarillo";
        colores[4] = "naranja";
        colores[5] = "rosa";
        colores[6] = "negro";
        colores[7] = "blanco";
        colores[8] = "morado";
        for (int i = 0; i<8;i++){
            palabras[i] = System.console().readLine();
            for (int j = 0; j<9;j++){
                if (palabras[i].equals(colores[j])){
                    a++;
                }
            }
        }
        for (int i = 0; i<8;i++){
            for (int j = 0; j<9;j++){
                if (palabras[i].equals(colores[j])){
                    palabras1[contador] = palabras[i];
                    contador++;
                }
                if (!(palabras[i].equals(colores[j]))){
                    h++;
                }
            }
            if (h==9){
                palabras1[a] = palabras[i];
                a++;
            }
            h=0;
        }
        System.out.println("Array original: ");
        for (int i = 0; i<8;i++){
            System.out.print(palabras[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Array resultado: ");
        for (int i = 0; i<8;i++){
            System.out.print(palabras1[i]+" ");
        }
    }
}