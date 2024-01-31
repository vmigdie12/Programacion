public class Ejercicio5_19 {
    public static void main(String[] args) {
        System.out.println("Introduce la altura de la piramide:");
        int alt;
        alt= Integer.parseInt(System.console().readLine());
        System.out.println("Introduce el caracter con el que quieres dibujar la piramide:");
        String cara;
        cara= System.console().readLine();
        int i=0;
        do {
            i++;
            for (int j=0;j<=alt-i;j++){
                System.out.print(" ");
            }   
            for (int k=1;k<=2*i-1;k++){
                System.out.print(cara);
            }
            System.out.println(" ");
        } while (i<=alt-1);
    }
}
