public class Ejercicio5_26 {
    public static void vuelta(int num,int num2){
        boolean salida = true;
        int digito = 0;
        String alreves="";
        while (salida){
            digito =num%10;
            num=num/10;
            alreves =alreves+digito;
            if(num<1){
                salida = false;
            }
        }
        num = Integer.parseInt(alreves);
        for (int i=1;i<=100000000;i++){
            if (num%10==num2){
                System.out.println("El digito ocupa la posicion: "+i);
            }
            num=num/10;
        }
    }
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        int num = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce un digito: ");
        int num2 = Integer.parseInt(System.console().readLine());
        vuelta(num,num2);
    }
}