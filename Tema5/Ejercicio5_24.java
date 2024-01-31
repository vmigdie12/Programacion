public class Ejercicio5_24 {
    public static void piramide(int altura, boolean inversa){
        int direccion = (inversa)?-1:1;
        int primera = (inversa)?altura:1;
        int ultima = (inversa)?1:altura;
        
        for(int i=primera; inversa?i>=ultima:i<=ultima; i=i+direccion){
            for(int j=1;j<=(altura-i);j++){
                System.out.print(" ");
            }
            int valor = 1;
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(valor);
                if(j<i)
                    valor++;
                else
                    valor--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Este programa pinta una pirámide hecha a base de números.");
        System.out.println("Por favor, introduzca la altura de la pirámide: ");
        int altura = Integer.parseInt(System.console().readLine());
        piramide(altura, false);
    }
    
}
