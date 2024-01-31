public class Ejercicio5_27 {
    public static void multiplos (int num){
        int k=1;
        int j=0;
        for (int i=1; i<=num; i++){
            if (i%3==0){
                System.out.println(k+" : "+i);
                k++;
                j=j+i;
            }
        }
        System.out.println("La suma de los multiplos de 3 son: "+ j);
    }
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        int num = Integer.parseInt(System.console().readLine());
        multiplos(num);
    }
}
