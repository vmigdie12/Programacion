public class Ejercicio5_31 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura de la L: ");
        int alt = Integer.parseInt(System.console().readLine());
        for (int i = 2; i<=alt; i++){
            System.out.println("*");
        }
        for (int j=1; j<=alt/2+1;j++){
            System.out.print("* ");
        }   
    }
}
