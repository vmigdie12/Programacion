public class Ejercicio5_47 {
    public static void ocho(int alt){
        if (alt%2!=0 && alt>=5){
            System.out.println("MMMMMM");
            for (int i=1;i<=(alt-3)/2;i++){
                System.out.println("M    M");
            }
            System.out.println("MMMMMM");
            for (int j=1;j<=(alt-3)/2;j++){
                System.out.println("M    M");
            }
            System.out.println("MMMMMM");
        }
        else{
            System.out.println("Introduce una altura correcta.");
        }
    }
    public static void main(String[] args) {
        System.out.print("Introduce la altura del ocho (tiene que ser impar y mayor a 5): ");
        int alt = Integer.parseInt(System.console().readLine());
        ocho(alt);
    }
}
