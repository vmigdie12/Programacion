public class Ejercicio5_36 {
    public static void capicua(long num){
        long dig = 0;
        String alreves = "";
        Boolean salida = true;
        long num2;
        long a=num;
        while (salida){
            dig=a%10;
            a=a/10;
            alreves=alreves+dig;
            if(a<1){
                salida = false;
            }
        }
        num2= Integer.parseInt(alreves);
        if (num==num2){
            System.out.println("El "+ num+ " es capicua");
        }
        if (!(num==num2)){
            System.out.println("El "+ num+ " no es capicua");
        }
    }
    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        long num = Integer.parseInt(System.console().readLine());
        capicua(num);
    }
}
