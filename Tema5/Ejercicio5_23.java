public class Ejercicio5_23 {
    public static void main(String[] args) {
        int contador=0;
        boolean a= true;
        int suma=0;
        do{
            System.out.println("Introduzca un numero: ");
            int num;
            num = Integer.parseInt(System.console().readLine());
            suma = suma + num;
            if (suma<=10000){
                contador++;
            }
            if (suma>=10000){
                a=false;
            }
        } while (a!=false);
        System.out.println("La cantidad de numeros introducidos es " + (contador));
        System.out.println("La suma de los numeros introducidos es " + (suma));
        System.out.println("La media de los numeros introducidos es " + (suma/contador));
    }
}