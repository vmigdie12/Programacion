public class Ejercicio5_16 {
    public static void main(String[] args) {
        System.out.println("¿Es mi numero primo?");
        int num;
        num = Integer.parseInt(System.console().readLine());
        int contador=0;
        for (int i=1;i<=num;i++){
            if (num%i==0){
                contador++;
            }
        }
        if (contador==2){
            System.out.println("Tu numero es primo");
        }else{
            System.out.println("Tu numero no es primo");
        }
    }
}
