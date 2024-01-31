public class Ejercicio5_63 {
    public static void piramides(int alt1, int alt2){
        int altpi = alt1 - alt2;
        int altpo = alt2 - alt1;
        int g = 1;
        int g2 = 1;
        if (alt1>=alt2){
            for (int i = 1; i<=alt1; i++){
                for (int j = alt1-i; j>=1 ; j--){
                    System.out.print(" ");
                }
                for (int j = 1; j<=i*2-1; j++){
                    System.out.print("*");
                }
                for (int j = alt1-i+1; j>=1 ; j--){
                    System.out.print(" ");
                }
                if (i>altpi){
                    for (int j = alt2-g; j>=1 ; j--){
                        System.out.print(" ");
                    }
                    for (int j = 1; j<=g*2-1; j++){
                        System.out.print("*");
                    }
                    g++;
                }
                System.out.println(" ");
            }
        }
        if (alt1<alt2){
            for (int i = 1; i<=alt2; i++){
                if (i<=altpo){
                    for (int j = 1; j<=alt1*2; j++){
                        System.out.print(" ");
                    }
                }
                if (i>altpo){
                    for (int j = alt1-g2; j>=1 ; j--){
                        System.out.print(" ");
                    }
                    for (int j = 1; j<=g2*2-1; j++){
                        System.out.print("*");
                    }
                    for (int j = alt1-g2+1; j>=1 ; j--){
                        System.out.print(" ");
                    }
                    g2++;
                }
                for (int j = alt2-i; j>=1 ; j--){
                    System.out.print(" ");
                }
                for (int j = 1; j<=i*2-1; j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
        
    }
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la primera piramide: ");
        int alt1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de la segunda piramide: ");
        int alt2 = Integer.parseInt(System.console().readLine());
        piramides(alt1, alt2);
    }
}