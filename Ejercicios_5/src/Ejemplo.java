import java.util.Scanner;
public class Ejemplo {
    public static long factorial(int valor){
        if(valor<0)
            return -1;
        long f = 1;
        for(int i = 1; i <= valor; i++)
            f*=i;
        return f;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Introduce un numero: ");
        int a = s.nextInt();
        long f = factorial(a);
        if(f==-1)
            System.out.println("No puedo calcular el factorial de un numero negativo");
        else
            System.out.println("El factorial de " + a+ " es "+ factorial(a));
        s.close();
    }
}