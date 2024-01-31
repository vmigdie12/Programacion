public class Ejercicio6_6 {
    public static void main(String[] args) {
        System.out.println("Adivina el numero del 0 al 100: ");
        int num;
        int numal = (int)(Math.random()*101);
        for (int i = 1 ; i<=5;i++){
            int intentos = 5-i;
            num = Integer.parseInt(System.console().readLine());
            if (num < numal){
                System.out.println("El numero es mayor al introducido, le quedan "+intentos+" intentos");
            }
            if (num > numal){
                System.out.println("El numero es menor al introducido, le quedan "+intentos+" intentos");
            }
            if (num == numal){
                System.out.println("Has adivinado el numero");
                break;
            }
        }
        System.out.println("El numero era el "+numal);
    }
}
