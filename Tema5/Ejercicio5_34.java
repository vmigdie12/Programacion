public class Ejercicio5_34 {
    public static void parimp(long num, long num2){
        boolean salida = true;
        boolean salida2 = true;
        boolean salida3 = true;
        long dig = 0;
        long dig2 = 0;
        long dig3 = 0;
        long dig4 = 0;
        String v ="";
        String v2 ="";
        String vpar = "";
        String vimp = "";
        while (salida){
            dig = num%10;
            num=num/10;
            v=v+dig;
            if (num<1){
                salida=false;
            }
        }
        num = Integer.parseInt(v);
        while (salida2){
            dig2 = num2%10;
            num2=num2/10;
            v2=v2+dig2;
            if (num2<1){
                salida2=false;
            }
        }
        num2 = Integer.parseInt(v2);
        while (salida3) {
            dig3=num%10;
            num=num/10;
            if (dig3%2==0){
                vpar = vpar + dig3;
            }
            if (!(dig3%2==0)){
                vimp = vimp + dig3;
            }
            dig4 = num2%10;
            num2 = num2/10;
            if (dig4%2==0){
                vpar = vpar + dig4;
            }
            if (!(dig4%2==0)){
                vimp = vimp + dig4;
            }
            if (num<1 && num2<1){
                salida3=false;
            }
        }
        int par = Integer.parseInt(vpar);
        int imp = Integer.parseInt(vimp);
        System.out.println("Numero formado por los pares: "+ par);
        System.out.println("Numero formado por los impares: "+ imp);
    }
    public static void main(String[] args) {
        System.out.print("Introduce un numero: ");
        long num = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce otro numero de la misma longitud: ");
        long num2 = Integer.parseInt(System.console().readLine());
        parimp(num, num2);
    }
}
