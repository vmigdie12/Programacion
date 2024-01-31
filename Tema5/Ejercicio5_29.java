public class Ejercicio5_29 {
    public static void divisibles (int num, int val){
        for (int i=1; i<=num; i++){
            if (!(i%val==0)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Introduce un numero entero: ");
        int num = Integer.parseInt(System.console().readLine());
        System.out.println("Introuduce otro numero: ");
        int val = Integer.parseInt(System.console().readLine());
        System.out.println("Estos son los numeros menores que el primer numero introducido que no divisibles entre el segundo introducido");
        divisibles(num, val);
    }
}