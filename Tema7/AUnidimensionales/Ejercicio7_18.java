package AUnidimensionales;
public class Ejercicio7_18 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] numeros100 = new int[10];
        int[] numeros200 = new int[10];
        int j = 0;
        int k = 0;
        for (int i =0;i<10;i++){
            numeros[i]=(int)(Math.random()*201);
            System.out.print(numeros[i]+ " ");
            if (numeros[i]<100){
                numeros100[j] = numeros[i];
                j++;
            }
            if (numeros[i]>100){
                numeros200[k] = numeros[i];
                k++;
            }
        }
        System.out.println(" ");
        for (int i = 0;i<10;i++){
            if (numeros100[i]!=0 && numeros200[i]!=0)
                System.out.print(numeros100[i]+ " "+ numeros200[i]+" ");
            if (numeros100[i]==0 && numeros200[i]!=0)
                System.out.print(numeros200[i]+" ");
            if (numeros100[i]!=0 && numeros200[i]==0)
                System.out.print(numeros100[i]+" ");
        }
    }
}