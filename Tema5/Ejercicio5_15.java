public class Ejercicio5_15 {
    public static void main(String[] args) {
        int valor = 1;
        System.out.println("Escribe una base: ");
        int a;
        a = Integer.parseInt(System.console().readLine());
        System.out.println("Escribe el exponente: ");
        int b;
        b = Integer.parseInt(System.console().readLine());
        int c = 1;

        for (int i = 1; i<=b; i++){
            valor = valor*a;
            System.out.println(a+"^"+c+" = "+valor);
            c++;
        }
        
    }
}
