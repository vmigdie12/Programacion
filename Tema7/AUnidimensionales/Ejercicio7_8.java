package AUnidimensionales;
public class Ejercicio7_8 {
    public static void main(String[] args) {
        int[] temperaturas = new int[12];
        System.out.println("Introduce la temperatura media de cada mes: ");
        System.out.print("Enero: ");
        temperaturas[0]=Integer.parseInt(System.console().readLine());
        System.out.print("Febrero: ");
        temperaturas[1]=Integer.parseInt(System.console().readLine());
        System.out.print("Marzo: ");
        temperaturas[2]=Integer.parseInt(System.console().readLine());
        System.out.print("Abril: ");
        temperaturas[3]=Integer.parseInt(System.console().readLine());
        System.out.print("Mayo: ");
        temperaturas[4]=Integer.parseInt(System.console().readLine());
        System.out.print("Junio: ");
        temperaturas[5]=Integer.parseInt(System.console().readLine());
        System.out.print("Julio: ");
        temperaturas[6]=Integer.parseInt(System.console().readLine());
        System.out.print("Agosto: ");
        temperaturas[7]=Integer.parseInt(System.console().readLine());
        System.out.print("Septiembre: ");
        temperaturas[8]=Integer.parseInt(System.console().readLine());
        System.out.print("Octubre: ");
        temperaturas[9]=Integer.parseInt(System.console().readLine());
        System.out.print("Noviembre: ");
        temperaturas[10]=Integer.parseInt(System.console().readLine());
        System.out.print("Diciembre: ");
        temperaturas[11]=Integer.parseInt(System.console().readLine());

        System.out.print("Enero: ");
        for( int i=1;i<=temperaturas[0];i++){
            System.out.print("*");
        }
        System.out.println(" "+temperaturas[0]+"ºC");
        System.out.print("Febrero: ");
        for( int i=1;i<=temperaturas[1];i++){
            System.out.print("*");
        }
        System.out.println(" "+temperaturas[1]+"ºC");
        System.out.print("Marzo: ");
        for( int i=1;i<=temperaturas[2];i++){
            System.out.print("*");
        }
        System.out.println(" "+temperaturas[2]+"ºC");
        System.out.print("Abril: ");
        for( int i=1;i<=temperaturas[3];i++){
            System.out.print("*");
        }
        System.out.println(" "+temperaturas[3]+"ºC");
        System.out.print("Mayo: ");
        for( int i=1;i<=temperaturas[4];i++){
            System.out.print("*");
        }
        System.out.println(" "+temperaturas[4]+"ºC");
        System.out.print("Junio: ");
        for( int i=1;i<=temperaturas[5];i++){
            System.out.print("*");
        }
        System.out.println(" "+temperaturas[5]+"ºC");
        System.out.print("Julio: ");
        for( int i=1;i<=temperaturas[6];i++){
            System.out.print("*");
        }
        System.out.println(" "+temperaturas[6]+"ºC");
        System.out.print("Agosto: ");
        for( int i=1;i<=temperaturas[7];i++){
            System.out.print("*");
        }
        System.out.println(" "+temperaturas[7]+"ºC");
        System.out.print("Septiembre: ");
        for( int i=1;i<=temperaturas[8];i++){
            System.out.print("*");
        }
        System.out.println(" "+temperaturas[8]+"ºC");
        System.out.print("Octubre: ");
        for( int i=1;i<=temperaturas[9];i++){
            System.out.print("*");
        }
        System.out.println(" "+temperaturas[9]+"ºC");
        System.out.print("Noviembre: ");
        for( int i=1;i<=temperaturas[10];i++){
            System.out.print("*");
        }
        System.out.println(" "+temperaturas[10]+"ºC");
        System.out.print("Diciembre: ");
        for( int i=1;i<=temperaturas[11];i++){
            System.out.print("*");
        }
        System.out.println(" "+temperaturas[11]+"ºC");
    }
}
