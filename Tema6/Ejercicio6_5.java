public class Ejercicio6_5 {
    public static void main(String[] args) {
        int max=0;
        int min=200;
        int suma=0;
        for (int i = 1; i<=50; i++){
            int num = (int)(Math.random()*100+100);
            System.out.print(num+" ");
            if (num > max)
                max=num;
            if (num<min)
                min=num;
            suma = suma+num;
        }
        System.out.println(" ");
        System.out.println("Minimo: "+min);
        System.out.println("Maximo: "+max);
        System.out.println("Media: "+(suma/50));
    }
}
