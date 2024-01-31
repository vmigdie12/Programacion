package AUnidimensionales;
public class Ejercicio7_21 {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        boolean salir = true;
        System.out.println("Array original: ");
        for (int i =0;i<15;i++){
            numeros[i]= (int)(Math.random()*501);
            System.out.print(numeros[i]+ " ");
            if (numeros[i]%5==0)
                numeros[i]=numeros[i];
            while (salir) {
                if (numeros[i]%5!=0)
                    numeros[i]=numeros[i]+1;
                if (numeros[i]%5==0)
                    salir=false;
            } 
            salir=true;
        }
        System.out.println("");
        System.out.println("Array cincuerizado: ");
        for (int i=0;i<15;i++){
            System.out.print(numeros[i]+ " ");
        }
    }
}