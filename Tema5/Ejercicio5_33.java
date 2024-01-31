public class Ejercicio5_33 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura de la U: ");
        int alt = Integer.parseInt(System.console().readLine());
        for (int i = 3; i<=alt+1; i++){
            System.out.print("*");
            for (int k=1; k<=alt/2+3;k++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int j=1; j<=alt/2+1;j++){
            System.out.print(" *");
        }   
    }
}