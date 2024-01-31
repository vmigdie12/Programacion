public class Ejercicio5_12 {
    public static void main(String[] args) {
        System.out.println("Cuántos números de la sucesión de Fibonacci se quieren mostrar? ");
        int numeros;
        int a=1, b=0, c=0;
        numeros = Integer.parseInt(System.console().readLine());
        int i = 1;
        while(i<=numeros){
            System.out.println(i+": "+c);
            i++;
            c=a+b;
            a=b;
            b=c;
        }
    }
}
