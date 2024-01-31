public class Ejercicio5_13 {
    public static void main(String[] args) {
        System.out.println("Introduce 10 numeros enteros: ");
        int positivos=0, negativos=0;
        for(int i = 1; i<=10; i++){
            int valor = 0;
            boolean correcto = false;
            while(!correcto){
                try{
                    valor = Integer.parseInt(System.console().readLine());
                    correcto = true;
                }catch (Exception e){
                    System.out.println("No lo he entendido");
                }
            }
            if (valor<0)
                negativos =negativos+1;
            if (valor >= 0)
                positivos =positivos+1;
        }
        System.out.println("Ha introducido "+ positivos+" numeros positivos y "+negativos+" numeros negativos");
    }
}
