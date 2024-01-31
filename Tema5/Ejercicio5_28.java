public class Ejercicio5_28 {
    public static void factorial(int num){
        int mult = 1;
        for (int i=num;i>0;i--){
            mult=mult*i;
        }
        System.out.println(mult);
    }
    public static void main(String[] args) {
        System.out.println("introduce un numero entero: "); 
        int num = Integer.parseInt(System.console().readLine());
        System.out.print(num + "! = ");
        factorial(num);
    }
}
