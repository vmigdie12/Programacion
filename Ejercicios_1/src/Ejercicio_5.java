public class Ejercicio_5 {
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String RESET = "\033[0m";  // Text Reset
    public static void main(String[] args) {
        System.out.printf("%-11s %-5s %-10s %-5s %-10s %-5s %-10s %-5s %-10s %-5s %-10s %-5s%n","Hora","|","Lunes","|","Martes","|","Miercoles","|","Jueves","|","Viernes","|");
        System.out.println("------------|----------------|----------------|----------------|----------------|----------------|");
        System.out.printf("%-11s %-5s %-5s %-10s %-9s %-8s %-5s %-8s %-5s %-11s %-5s%n","8:15-9:15","|",RED+"Prog"+RESET,"",BLUE+"Leng mar"+RESET,"",BLUE+"Leng mar"+RESET,"",RED+"Prog"+RESET,"",CYAN+"Fol"+RESET);
        System.out.println("------------|----------------|----------------|----------------|----------------|----------------|");
        System.out.printf("%-11s %-5s %-5s %-10s %-9s %-8s %-5s %-8s %-5s %-11s %-5s%n","9:15-10:15","|",RED+"Prog"+RESET,"",BLUE+"Leng mar"+RESET,"",BLUE+"Leng mar"+RESET,"",RED+"Prog"+RESET,"",CYAN+"Fol"+RESET);
        System.out.println("------------|----------------|----------------|----------------|----------------|----------------|");
        System.out.printf("%-11s %-5s %-5s %-10s %-9s %-8s %-5s %-12s %-10s %-11s %-5s%n","10:15-11:15","|",RED+"Prog"+RESET,"",PURPLE+"Base Dat"+RESET,"",RED+"Prog"+RESET,"",RED+"Prog"+RESET,"",CYAN+"Fol"+RESET);
        System.out.println("------------|----------------|----------------|----------------|----------------|----------------|");
        System.out.printf("%-10s %-5s %-10s %-5s %-10s %-5s %-10s %-5s %-10s %-5s %-10s %-5s%n","11:15-11:45","|","RE","|","C","|","R","|","E","|","O","|");
        System.out.println("------------|----------------|----------------|----------------|----------------|----------------|");
        System.out.printf("%-11s %-5s %-5s %-6s %-9s %-8s %-5s %-12s %-5s %-7s %-5s%n","11:45-12:45","|",GREEN+"Sist inf"+RESET,"",PURPLE+"Base Dat"+RESET,"",RED+"Prog"+RESET,"",PURPLE+"Base Dat"+RESET,"",GREEN+"Sist inf"+RESET);
        System.out.println("------------|----------------|----------------|----------------|----------------|----------------|");
        System.out.printf("%-11s %-5s %-5s %-6s %-9s %-8s %-5s %-8s %-5s %-7s %-5s%n","12:45-13:45","|",GREEN+"Sist inf"+RESET,"",YELLOW+"Entornos"+RESET,"",PURPLE+"Base Dat"+RESET,"",PURPLE+"Base Dat"+RESET,"",GREEN+"Sist inf"+RESET);
        System.out.println("------------|----------------|----------------|----------------|----------------|----------------|");
        System.out.printf("%-11s %-5s %-5s %-6s %-9s %-8s %-5s %-8s %-5s %-7s %-5s%n","13:45-14:45","|",GREEN+"Sist inf"+RESET,"",YELLOW+"Entornos"+RESET,"",PURPLE+"Base Dat"+RESET,"",YELLOW+"Entornos"+RESET,"",GREEN+"Sist inf"+RESET);
        System.out.println("------------|----------------|----------------|----------------|----------------|----------------|");
        }
    }

