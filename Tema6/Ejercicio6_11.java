public class Ejercicio6_11 {
    public static void main(String[] args) {
        String resultado = "";
        int sus=0;
        int suf=0;
        int bie=0;
        int not=0;
        int sob=0;
        for(int i= 1; i<=20;i++){
            int nota = (int)(Math.random()*11);
            if (nota<5){
                resultado = "Suspenso";
                sus++;
                }
            if (nota ==5){
                resultado = "Suficiente";
                suf++;
            }
            if (nota >=6 && nota<7){
                resultado = "Bien";
                bie++;
            }
            if (nota >=7 && nota<9){
                resultado = "Notable";
                not++;
            }
            if (nota >=9 && nota<11){
                resultado = "Sobresaliente"; 
                sob++;
            }
            System.out.println(i+": "+resultado);
        }
        System.out.println(" ");
        System.out.println("Suspensos: "+ sus);
        System.out.println("Suficientes: "+ suf);
        System.out.println("Bien: "+ bie);  
        System.out.println("Notables: "+ not);  
        System.out.println("Sobresalientes: "+ sob);                 
    }
}
