public class Ejercicio6_13 {
    public static void main(String[] args) {
        boolean salida = true;
        while (salida) {
            int tirada1 = (int)(Math.random()*6+1);
            System.out.print(tirada1+" ");
            int tirada2 = (int)(Math.random()*6+1);
            System.out.println(tirada2);
            if (tirada1 == tirada2)
                salida = false;
        }
    }
}
