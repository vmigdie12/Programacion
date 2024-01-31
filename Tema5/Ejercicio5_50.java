public class Ejercicio5_50 {
    public static void cinco(int alt, int esp){
        if (alt >= 5 && esp >=1){
            //primera linea
            System.out.print("*");
            for (int j=1;j<=esp;j++){
                System.out.print(" ");
            }
            System.out.print("****");
            for (int j=1;j<=esp;j++){
                System.out.print(" ");
            }
            System.out.println("****");
            //segunda linea
            System.out.print("*");
            for (int j=1;j<=esp;j++){
                System.out.print(" ");
            }
            System.out.print("*   ");
            for (int j=1;j<=esp;j++){
                System.out.print(" ");
            }
            System.out.println("*   ");
            //tercera linea
            System.out.print("*");
            for (int j=1;j<=esp;j++){
                System.out.print(" ");
            }
            System.out.print("****");
            for (int j=1;j<=esp;j++){
                System.out.print(" ");
            }
            System.out.println("****");
            //lineas que cambian
            for (int i = 1; i<=alt-4; i++){
                System.out.print("*");
                for (int j=1;j<=esp;j++){
                    System.out.print(" ");
                }
                System.out.print("   *");
                for (int j=1;j<=esp;j++){
                    System.out.print(" ");
                }
                System.out.println("   *");
            }
            //ultima linea
            System.out.print("*");
            for (int j=1;j<=esp;j++){
                System.out.print(" ");
            }
            System.out.print("****");
            for (int j=1;j<=esp;j++){
                System.out.print(" ");
            }
            System.out.println("****");
        }
        else{
            System.out.println("Introduce una altura y espacios adecuada.");
        }
    }
    public static void main(String[] args) {
        System.out.print("Introduce la altura del cartel(como minimo de 5): ");
        int alt = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
        int esp = Integer.parseInt(System.console().readLine());
        cinco(alt, esp);
    }
}