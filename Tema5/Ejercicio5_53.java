public class Ejercicio5_53 {
    public static void triangulo(int alt){
        for(int i= alt ; i >= 1 ; i--){
            for ( int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        System.out.print("Introduce la altura del triangulo: ");
        int alt = Integer.parseInt(System.console().readLine());
        triangulo(alt);
    }
}
