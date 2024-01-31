package AUnidimensionales; 
public class Ejercicio7_15 {
    public static void main(String[] args) {
        int[] ocupacioni = new int[10];
        int mesa=0;
        int contador = 0;
        int contadorsalida = 0;
        boolean salir = true;
        System.out.print("Mesa nº:   ");
        for (int i =0; i<10;i++){
            System.out.print(i+1+" ");
        }
        System.out.println(" ");
        System.out.print("Ocupacion: ");
        for (int i =0; i<10;i++){
            ocupacioni[i]= (int)(Math.random()*5);
            System.out.print(ocupacioni[i]+" ");
        }
        while (salir) {
            System.out.println("");
            System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            int numper = Integer.parseInt(System.console().readLine());
            if (numper<5&&numper>0){
                for (int i=0;i<10;i++){
                    if (ocupacioni[i]==0){
                        ocupacioni[i]=numper;
                        mesa = i+1;
                        break;
                    }
                    if (ocupacioni[i]!=0){
                        contador++;
                    }
                }
                if (contador == 10){
                    for (int i=0;i<10;i++){
                        if (ocupacioni[i]+numper<5){
                            ocupacioni[i]=ocupacioni[i]+numper;
                            mesa = i+1;
                            System.out.print("Tendrán que compartir mesa. ");
                            break;
                        }
                        if (ocupacioni[i]+numper>=5){
                            contadorsalida++;
                        }
                    }
                }
                if (contadorsalida == 10){
                    System.out.print("Lo siento, en estos momentos no queda sitio. ");
                    break;
                }
                System.out.println("Por favor, siéntense en la mesa número "+mesa);
                System.out.print("Mesa nº:   ");
                for (int j =0; j<10;j++){
                    System.out.print(j+1+" ");
                }
                System.out.println(" ");
                System.out.print("Ocupacion: ");
                for (int j =0; j<10;j++){
                    System.out.print(ocupacioni[j]+" ");
                }
                contador=0;
            }
            if (numper>4){
                System.out.println("Lo siento, no admitimos grupos de "+ numper +", haga grupos de 4 personas como máximo e intente de nuevo");
            }
            if (numper==-1){
                System.out.println("Gracias. Hasta pronto.");
                salir = false;
            }
        }
    }
}
