public class Ejercicio5_32 {
    public static void pares(long num){
        boolean salida = true;
        boolean salida2 = true;
        long dig = 0;
        long dig2 = 0;
        long suma = 0;
        String v ="";
        System.out.print("Digitos pares: ");
        while (salida){
            dig = num%10;
            num=num/10;
            v=v+dig;
            if (num<1){
                salida=false;
            }
        }
        num = Integer.parseInt(v);
        while (salida2) {
            dig2 =num%10;
            num=num/10;
            if (dig2%2==0){
                System.out.print(dig2+" ");
                suma=suma+dig2;
            }
            if (num<1){
                salida2=false;
            }
        }
        System.out.println(" ");
        System.out.println("Suma de los numeros pares: "+ suma);
    }
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        long num = Integer.parseInt(System.console().readLine());
        pares(num);
    }
}