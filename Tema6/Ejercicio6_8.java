public class Ejercicio6_8 {
    public static String obtenerPleno (){
        int valor;
        switch (valor = (int)(Math.random()*4)) {
            case 0:
            case 1:
            case 2:
                return String.valueOf(valor);
            default:
                return "M";
        }
    }
    public static String obtenerApuesta(){
        switch ((int)(Math.random()*6)) {
            case 0:
            case 1:
            case 2:
                return "1  ";
            case 3:
            case 4:
                return " X ";
            case 5:
                return "  2";
            default:
                return "";
        }
    }
    public static void imprimirPleno(){
        System.out.println("Pleno al 15 - Local...%s Visitante...%s"+obtenerPleno()+obtenerPleno());
    }
    public static void imprimirLinea(int linea){
        System.out.printf("%2 |%s|%s|%s|%n",
                    linea,
                    obtenerApuesta(),obtenerApuesta(),obtenerApuesta());
    }
    public static void imprimirApuesta(){
        for(int i = 1; i<=14; i++){
            imprimirLinea(i);
        }
        imprimirPleno();
    }
    public static void main(String[] args) {
        imprimirApuesta();
    }
}
