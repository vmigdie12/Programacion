public class Ejercicio5_41 {
    public static void parimp (long num){
        boolean salir = true;
        long dig = 0;
        long dig2 = 0;
        long par = 0;
        long impar = 0;
        long num1 = num;
        String alreves = "";
        while (salir){
            dig = num%10;
            num = num/10;
            alreves = alreves+dig;
            if (num<1){
                salir = false;
            }
        }
        num = Integer.parseInt(alreves);
        while (!salir){
            dig2 = num%10;
            num=num/10;
            if (dig2%2==0){
                par++;
            }
            if (dig2%2!=0){
                impar++;
            }
            if (num<1){
                salir = true;
            }
        }
        System.out.println("El "+num1+" tiene "+ par + " digitos pares y "+impar +" digitos impares.");
    }
    public static void main(String[] args) {
        System.out.print("Introduce un numero: ");
        long num= Integer.parseInt(System.console().readLine());
        parimp(num);
    }
}
