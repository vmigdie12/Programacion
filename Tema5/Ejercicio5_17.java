public class Ejercicio5_17 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero positivo entero: ");
        int num;
        num= Integer.parseInt(System.console().readLine());
        int suma=0;
        int a =0;
        if (num >=0){
            System.out.println("Tu numero si es positivo, y la suma de sus 100 siguientes numeros enteros es: ");
            for (int i=0;i<=100;i++){
                a=num+i;
                suma=suma+a;
                
            }
            System.out.println(suma);
        }else{
            System.out.println("Tu numero es negativo, por favor escribe uno positivo");
        }
    }
}
