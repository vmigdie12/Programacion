public class Ejercicio5_38 {
    public static void xx(int alt){
        if (alt<3){
            System.out.println("La altura tiene que ser impar y mayor o igual a 3");
        }
        else if (alt%2==0){
            System.out.println("La altura tiene que ser impar y mayor o igual a 3");
        }
        else{
            for (int i=1;i<=alt;i++){
                if (i<=alt/2){
                    for (int j=0;j<=i-1;j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int h=1;h<=(alt-i*2);h++){
                        System.out.print("*");
                    }  
                    System.out.print("*"); 
                    System.out.println(" ");
                    }
                if (i==alt/2+1){
                    for (int c=0;c<=alt/2;c++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    System.out.println(" ");
                    }
                if (i>=alt/2+2){
                    for (int j=0;j<=alt-i;j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int h=1;h<=(i*2-(alt+2));h++){
                        System.out.print("*");
                    }  
                    System.out.print("*"); 
                    System.out.println(" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Introduce la altura (tiene que ser impar y mayor o igual a 3): ");
        int alt = Integer.parseInt(System.console().readLine());
        xx(alt);
    }
}