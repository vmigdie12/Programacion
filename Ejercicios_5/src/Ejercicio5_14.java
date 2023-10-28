public class Ejercicio5_14 {
    public static void main(String[] args) {
        int valor = 1;
        System.out.println("Escribe una base: ");
        int a = 0;
        a = Integer.parseInt(System.console().readLine());
        System.out.println("Escribe el exponente: ");
        int b=0;
        b = Integer.parseInt(System.console().readLine());

        for (int i = 1; i<=b; i++){
            valor = valor*a;
        }
        System.out.println("El resultado de la potencia es: "+ valor);
    }
}
