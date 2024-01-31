public class Ejercicio4_1 {
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca la hora (0-23): ");

            int hora = Integer.parseInt(System.console().readLine());
            if(hora>=0 && hora < 6){
                System.out.println("Buenas noches");
            }else if (hora>=6 && hora<=12){
                System.out.println("Buenos dias");
            }else if (hora>12 && hora<=20){
                System.out.println("Buenas tardes");
            }else if (hora>20 && hora <= 23){
                System.out.println("Buenas noches");
            }
            else{
                System.out.println("La hora no es valida");
            }
            
    }
}