public class Ejercicio5_20 {
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
            if (i==1 || i==alt){
                for (int k=1;k<=2*i-1;k++){
                    System.out.print(cara);
                }
            }
            if (i!=1 && i!=alt){
                System.out.print(cara);
                for (int k=1;k<=2*i-3;k++){
                    System.out.print(" ");
                }  
                System.out.print(cara);
            }

            System.out.println(" ");
        } while (i<=alt-1);
    }
}
