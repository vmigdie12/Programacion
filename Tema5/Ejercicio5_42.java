public class Ejercicio5_42 {
    public static void primo(int num){
        int contador=0;
        for (int i=1;i<=num;i++){
            if (num%i==0){
                contador++;
            }
        }
        if (contador==2){
            System.out.println(" es primo");
        }else{
            System.out.println(" no es primo");
        }
    }
    public static void main(String[] args) {
        System.out.print("Introduce un numero entero positivo: ");
        int num = Integer.parseInt(System.console().readLine());
        System.out.println(" ");
        for (int i=0;i<=4;i++){
            System.out.print((num+i));
            primo(num+i);
            System.out.println(" ");
        }
    }
}
