public class Ejercicio5_22 {
    public static boolean esPrimo(int valor){
        if(valor<=1)
            return false;
        boolean primo = true;
        for(int i=2; primo && i <=valor/2 ; i++){
            if(valor%i==0)
                primo = false;
        }
        return primo;
    }
    public static void primosEntre(int min, int max){
        for(int i = min; i <= max; i++){
            if(esPrimo(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Números primos entre dos números.");
        System.out.println("Introduzca desde qué número quiere observar los primos: ");
        int min = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca hasta qué número quiere observar los primos: ");
        int max = Integer.parseInt(System.console().readLine());        
        primosEntre(min, max);
    }
}