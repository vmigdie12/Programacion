public class Ejercicio_10 {
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String RESET = "\033[0m";  // Text Reset
    public static void main(String[] args) {
        System.out.printf("%16s%n",RED+"\u2588"+"\u2588"+RESET);
        System.out.printf("%14s%n",RED+"\u2588"+"\u2588"+RESET);
        System.out.printf("%16s%n",RED+"\u2588"+"\u2588"+RESET);
        System.out.println( );
        System.out.printf("%19s%n",GREEN+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588");
        System.out.printf("%6s %3s%n","\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588","\u2588"+"\u2588");
        System.out.printf("%8s%n","\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588");   
        System.out.printf("%6s%n","\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588");
        System.out.printf("%6s%n","\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588"+"\u2588");
    }
}
