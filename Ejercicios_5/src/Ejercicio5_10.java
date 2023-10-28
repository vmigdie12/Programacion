public class Ejercicio5_10 {
    public static void main(String[] args) {
        float valores = 0;
        float suma = 0;
        float i=0;
        System.out.println("Voy a calcular la media de tus numeros, para acabar de introducir datos introduce un numero negativo. ");
        boolean correcto = false;
        while (!correcto){
            valores = Integer.parseInt(System.console().readLine());
            if (valores<0){
                correcto=true;
            }else{
            suma = suma + valores;
            i++;
            }
        }
        System.out.println("La media es: "+(suma/i));
    }
}