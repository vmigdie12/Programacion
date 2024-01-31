public class Ejercicio6_9 {
    public static void main(String[] args) {
        boolean salir=true;
        int i = 0;
        int num = 0;
        while(salir){
            num = (int)(Math.random()*101);
            if (num%2==0){
                System.out.print(num+ " ");
                i++;
            }
            if (num == 24){
                salir = false;
            }
        }
        System.out.println("Se han generado " + i + " numeros");
    }
}