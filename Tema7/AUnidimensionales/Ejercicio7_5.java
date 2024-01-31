package AUnidimensionales;
public class Ejercicio7_5 {
    public static void main(String[] args) {
        int[] num = new int[10];
        int num1;    
        int maximo=0;
        int minimo=10000;    
        for (int i = 0;i<10;i++){
            num1 = Integer.parseInt(System.console().readLine());
            num[i]= num1;
            if (num1>maximo)
                maximo = num1;
            if (num1<minimo)
                minimo = num1;
        }
        for (int i = 0; i<10;i++){
            System.out.print(num[i]);
            if (maximo == num[i])
                System.out.print(" "+ "maximo");
            if (minimo == num[i])
                System.out.print(" "+ "minimo");
            System.out.println("");
        }
    }
}
