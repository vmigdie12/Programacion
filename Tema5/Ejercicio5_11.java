public class Ejercicio5_11 {
    public static void main(String[] args) {
        System.out.print("Introduce un numero: ");
        int num = 0;
        num = Integer.parseInt(System.console().readLine());
        int i = 1;
        System.out.printf("%-11s %-11s %-11s%n","numero","cuadrado","cubo");
        while (i<=6) {
            int a , b;
            a=num*num;
            b=num*num*num;
            System.out.printf("%1s %-5s %-5s %-10s %-10s%n","",num,":",a,b);
            i++;
            num++;
        }
    }
}
