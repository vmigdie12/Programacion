public class Ejercicio6_14 {
    public static void main(String[] args) {
        System.out.println("Piensa un numero del 0 al 100 e intentare adivinarlo ");
        boolean salida = true;
        int i = 0;
        int numa1= (int)(Math.random()*101);
        int numa2 = numa1;
        int numin = 0;
        System.out.println(numa1);
        while (salida){
            i++;
            if(i==5){
                System.out.println("No he podido adivinar el numero ");
                break;
            }
            System.out.println("¿He acertado?");
            String sino = System.console().readLine();
            if (sino.equals("no")){
                System.out.println("¿El numero es mayor o menor?");
                String mayoromenor = System.console().readLine();
                if (mayoromenor.equals("mayor")){
                    if (numin>numa2)
                        numin = numa2;
                    numa2 = (int)(Math.random()*(101-numin)+numin);
                    System.out.println(numa2);
                }
                if (mayoromenor.equals("menor")){
                    numa2 = (int)(Math.random()*numa2);
                    System.out.println(numa2);
                }
            }
            if (sino.equals("si")){
                System.out.println("He adivinado el numero");
                break;
            }
        }
    }
}