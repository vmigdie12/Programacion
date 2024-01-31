public class Ejercicio5_21 {
    public static void main(String[] args) {
        int contador=0;
        boolean a= true;
        int parmax=0;
        int media=0;
        float contadorimp=0;
        do{
            System.out.println("Introduzca un numero (negativo para finalizar): ");
            int num;
            num = Integer.parseInt(System.console().readLine());
            if (num>=0){
                contador++;
                if (num%2==0){
                    if(parmax<num){
                        parmax=num;
                    }
                }
                else{
                    media=num+media;
                    contadorimp++;
                }
            }
            else{
                a=false;
            }
        } while (a!=false);
        System.out.println("Has introducido " + contador + " numeros");
        System.out.println("El numero par mayor introducido es " + parmax);
        System.out.println("La media de los numeros impares introducidos es " + (media/contadorimp));
    }
}