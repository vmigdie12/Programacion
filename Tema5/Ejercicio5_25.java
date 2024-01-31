public class Ejercicio5_25 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        int num = Integer.parseInt(System.console().readLine());
        boolean salida = true;
        int digito = 0;
        while (salida){
            digito =num%10;
            num=num/10;
            if(num<1){
                salida = false;
            }
            System.out.print(digito);
        }
    }
}
