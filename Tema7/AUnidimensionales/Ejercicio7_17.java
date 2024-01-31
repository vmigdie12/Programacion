package AUnidimensionales;
public class Ejercicio7_17 {    //No acabado
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] numeros1 = new int[10];
        boolean salida2 = true;
        int a = 0;
        int b = 0;
        int x = 0;
        int y = 0;
        int contador = 0;
        boolean salir = true;
        for (int i = 0; i<10; i++){
            numeros[i]=(int)(Math.random()*101);
            numeros1[i]=numeros[i];
            System.out.print(numeros[i]+" ");
        }
        System.out.println(" ");
        System.out.print("Introduce un numero de los generados: ");
        while (salir) {
            if (x==1)
                break;
            if (y==1)
                break;
            int num = Integer.parseInt(System.console().readLine());
            for(int i = 0; i<10;i++){
                if (num == numeros[i]){
                    if (i==0){
                        System.out.println("El numero introducido es el primero generado por lo que no se rota el array: ");
                        for (int l = 0; l<10; l++){
                            System.out.print(numeros[l]+" ");
                        }
                        x++;
                    }
                    if (i!=0){
                        a=10-i;
                        while (salida2){
                            for (int l = 0; l<10;l++){
                                if (l==0){
                                    numeros1[0]= numeros[9];
                                    numeros[9]= numeros[8];
                                }
                                if (l==1){
                                    numeros1[0]= numeros[9];
                                    numeros[9]= numeros[8];
                                }
                                else if (l!=0&&l!=1){
                                    numeros1[l]= numeros[l-1];
                                    numeros[l-1]= numeros[l-2];
                                }
                            }
                            b++;
                            if (a==b)
                                salida2 = false;
                        }
                        System.out.println("Array rotado: ");
                        for (int j = 0; j<10; j++){
                            System.out.print(numeros1[j]+" ");
                        }
                        y++;
                    }
                }
                if (num != numeros[i]){
                    contador++;
                }
                if (contador==10){
                    System.out.println("No has introducido uno de los numeros generados, por favor intentalo de nuevo.");
                    contador=0;
                }
            }
        }
    }   
}
