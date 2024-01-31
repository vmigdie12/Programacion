public class Ejercicio5_37 {
    public static void palotes(int num){
        long dig = 0;
        long dig2 = 0;
        String alreves = "";
        Boolean salida = true;
        boolean salida2 = true;
        while (salida){
            dig=num%10;
            num=num/10;
            alreves=alreves+dig;
            if(num<1){
                salida = false;
            }
        }
        num = Integer.parseInt(alreves);
        while (salida2){
            dig2=num%10;
            num=num/10;
            for (int i = 1; i<=dig2; i++){
                System.out.print("| ");
            }
            System.out.print("- ");
            if(num<1){
                salida2 = false;
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int num = Integer.parseInt(System.console().readLine());
        palotes(num);
    }
}
