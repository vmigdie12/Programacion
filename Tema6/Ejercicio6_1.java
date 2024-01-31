public class Ejercicio6_1 {
    public static void main(String[] args) {
        System.out.print("Tirada de tres dados: ");
        int suma = 0;
        int a = 0;
        for (int i =1;i<=3;i++){
            a = (int)(Math.random()*6+1);
            System.out.print(a+ " ");
            suma=suma+a;
        }
        System.out.println(suma);
    }
}
