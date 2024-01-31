public class Simulacro {
    public static String obtenerpalo(){
        switch ((int)(Math.random()*4+1)) {
            case 1:
                return "Oros";
            case 2:
                return "Copas";
            case 3:
                return "Espadas";
            case 4:
                return "Bastos";
            default:
                return "";
        }
    }
    public static void main(String[] args) {
        int num;
        double valor = 0;
        double valormaquina = 0;
        boolean salir = true;
        boolean salirmaquina = true;
        System.out.print("Esta es tu primera carta: ");
        switch (num =(int)(Math.random()*10+1)) {
            case 1:
                System.out.print(num + " de "); 
                valor = 1;
                break;
            case 2:
                System.out.print(num + " de ");
                valor = 2;
                break;
            case 3:
                System.out.print(num + " de ");
                valor = 3;
                break;
            case 4:
                System.out.print(num + " de "); 
                valor = 4;
                break;
            case 5:
                System.out.print(num + " de ");
                valor = 5;
                break; 
            case 6:
                System.out.print(num + " de ");
                valor = 6;
                break; 
            case 7:
                System.out.print(num + " de "); 
                valor = 7;
                break;
            case 8:
                System.out.print("Sota de "); 
                valor = 0.5;
                break;
            case 9:
                System.out.print("Caballo de "); 
                valor = 0.5;
                break;
            case 10:
                System.out.print("Rey de "); 
                valor = 0.5;
                break;
        }
        System.out.println(obtenerpalo());
        System.out.println("El valor de tu carta es: "+ valor + " (recuerda que no puedes pasarte de siete y medio)");
        while (salir){
            System.out.print("¿Quieres pedir otra carta? ");
            String elegir = System.console().readLine();
            if (elegir.equals("si")){
                System.out.print("Esta es tu nueva carta: ");
                switch (num =(int)(Math.random()*10+1)) {
                    case 1:
                        System.out.print(num + " de "); 
                        valor = valor+1;
                        break;
                    case 2:
                        System.out.print(num + " de ");
                        valor = valor+2;
                        break;
                    case 3:
                        System.out.print(num + " de ");
                        valor = valor+3;
                        break;
                    case 4:
                        System.out.print(num + " de "); 
                        valor = valor+4;
                        break;
                    case 5:
                        System.out.print(num + " de ");
                        valor = valor+5;
                        break; 
                    case 6:
                        System.out.print(num + " de ");
                        valor = valor+6;
                        break; 
                    case 7:
                        System.out.print(num + " de "); 
                        valor = valor+7;
                        break;
                    case 8:
                        System.out.print("Sota de "); 
                        valor = valor+0.5;
                        break;
                    case 9:
                        System.out.print("Caballo de "); 
                        valor = valor+0.5;
                        break;
                    case 10:
                        System.out.print("Rey de "); 
                        valor = valor+0.5;
                        break;
                }
                System.out.println(obtenerpalo());
                System.out.println("El valor de tu nueva carta es: "+ valor);
            }
            if (elegir.equals("no")){
                System.out.println(" ");
                System.out.println("Ahora es mi turno");
                System.out.print("Mi primera carta es: ");
                switch (num =(int)(Math.random()*10+1)) {
                    case 1:
                        System.out.print(num + " de "); 
                        valormaquina = 1;
                        break;
                    case 2:
                        System.out.print(num + " de ");
                        valormaquina = 2;
                        break;
                    case 3:
                        System.out.print(num + " de ");
                        valormaquina = 3;
                        break;
                    case 4:
                        System.out.print(num + " de "); 
                        valormaquina = 4;
                        break;
                    case 5:
                        System.out.print(num + " de ");
                        valormaquina = 5;
                        break; 
                    case 6:
                        System.out.print(num + " de ");
                        valormaquina = 6;
                        break; 
                    case 7:
                        System.out.print(num + " de "); 
                        valormaquina = 7;
                        break;
                    case 8:
                        System.out.print("Sota de "); 
                        valormaquina = 0.5;
                        break;
                    case 9:
                        System.out.print("Caballo de "); 
                        valormaquina = 0.5;
                        break;
                    case 10:
                        System.out.print("Rey de "); 
                        valormaquina = 0.5;
                        break;
                }
                System.out.println(obtenerpalo());
                while (salirmaquina){
                    if (valormaquina<valor){
                        System.out.print("Esta es mi nueva carta: ");
                        switch (num =(int)(Math.random()*10+1)) {
                            case 1:
                                System.out.print(num + " de "); 
                                valormaquina = valormaquina+1;
                                break;
                            case 2:
                                System.out.print(num + " de ");
                                valormaquina = valormaquina+2;
                                break;
                            case 3:
                                System.out.print(num + " de ");
                                valormaquina = valormaquina+3;
                                break;
                            case 4:
                                System.out.print(num + " de "); 
                                valormaquina = valormaquina+4;
                                break;
                            case 5:
                                System.out.print(num + " de ");
                                valormaquina = valormaquina+5;
                                break; 
                            case 6:
                                System.out.print(num + " de ");
                                valormaquina = valormaquina+6;
                                break; 
                            case 7:
                                System.out.print(num + " de "); 
                                valormaquina = valormaquina+7;
                                break;
                            case 8:
                                System.out.print("Sota de "); 
                                valormaquina = valormaquina+0.5;
                                break;
                            case 9:
                                System.out.print("Caballo de "); 
                                valormaquina = valormaquina+0.5;
                                break;
                            case 10:
                                System.out.print("Rey de "); 
                                valormaquina = valormaquina+0.5;
                                break;
                        }
                        System.out.println(obtenerpalo());
                        System.out.println("El valor de mis cartas es: "+ valormaquina);
                    }
                    if (valormaquina>valor && valormaquina<=7.5){
                        System.out.println("He ganado, lo siento, volvamos a jugar.");
                        salirmaquina = false;
                    }
                    if (valormaquina>7.5){
                        System.out.println("He perdido, por lo que tu has ganado, FELICIDADES.");
                        salirmaquina = false;
                    }
                }
                salir = false;
            }
            if (valor>7.5){
                System.out.println("Lo siento, has perdido");
                salir = false;
            }
        }
        
    }
}