package AUnidimensionales;
public class Ejercicio7_13 {
    public static void main(String[] args) {
        int minimo=500;
        int maximo=0;
        int[] numeros = new int[100];
        for (int i =0; i<100; i++){
            numeros[i]= (int)(Math.random()*501);
            if (numeros[i]>maximo)
                maximo = numeros[i];
            if (numeros[i]<minimo)
                minimo = numeros[i];
            System.out.print(numeros[i]+" ");
        }
        System.out.println(" ");
        System.out.println("¿Qué quiere destacar? (1 - mínimo, 2 - máximo): ");
        int pregunta = Integer.parseInt(System.console().readLine());
        if (pregunta == 1){
            for (int i =0; i<100; i++){
                if (numeros[i]==minimo)    
                    System.out.print("**"+numeros[i]+"** ");
                if (numeros[i]!=minimo)    
                    System.out.print(numeros[i]+" ");
            }
        }
        if (pregunta == 2){
            for (int i =0; i<100; i++){
                if (numeros[i]==maximo)    
                    System.out.print("**"+numeros[i]+"** ");
                if (numeros[i]!=maximo)    
                    System.out.print(numeros[i]+" ");
            }
        }
    }
}
