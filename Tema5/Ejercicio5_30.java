public class Ejercicio5_30 {
    public static void tiempo(int dia1, int hora1, int dia2, int hora2){
        if (dia1>7||dia1<1||dia2>7||dia2<1){
            System.out.println("Introduce los dias correctamente");
        }
        else if (dia1>dia2){
            System.out.println("El segundo dia tiene que ser posterior al primero");
        }
        else if (hora1>24||hora1<0||hora2>24||hora2<0){
            System.out.println("La hora no puede ser menor a 0 o mayor a 24");
        }
        else {
            int horaa1 = hora1 + (24*(dia1-1));
            int horaa2 = hora2 + (24*(dia2-1));
            int i = horaa2 - horaa1;
            System.out.println("Entre las " + hora1 + " del dia "+ dia1 + " y las "+hora2+" del dia " + dia2+ " hay " + i +" hora/s");
        }
    }
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca la primera hora.");
        System.out.print("Dia: ");
        int dia1= Integer.parseInt(System.console().readLine());
        System.out.print("Hora: ");
        int hora1= Integer.parseInt(System.console().readLine());
        System.out.println("Por favor, introduzca la segunda hora.");
        System.out.print("Dia: ");
        int dia2= Integer.parseInt(System.console().readLine());
        System.out.print("Hora: ");
        int hora2= Integer.parseInt(System.console().readLine());
        tiempo(dia1,hora1,dia2,hora2);
    }
}
