public class Ejercicio5_39 {
    public static void factorial(int num){
        int mult = 1;
        for (int i=num;i>0;i--){
            mult=mult*i;
        }
        System.out.println(mult);
    }
    public static void main(String[] args) {
        System.out.print("Introduzca un numero: ");
        int num = Integer.parseInt(System.console().readLine());
        for (int i= 1; i<=num;i++){
            System.out.print(i + "! = ");
            factorial(i);
        }
    }
}
