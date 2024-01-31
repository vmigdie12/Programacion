public class Ejercicio6_15 {
    public static String nota (){
        int nota = (int)(Math.random()*6);
        switch (nota) {
            case 0:
                return "do";
            case 1:
                return"re";
            case 2:
                return"mi";
            case 3:
                return"fa";
            case 4:
                return"sol";
            case 5:
                return"la";
            case 6:
                return"si";
            default:
                return "";
        }
    }
    public static void main(String[] args) {
        int melodia=0;
        String nota1 = nota();
        boolean salir = true;
        while (salir){
            melodia = (int)(Math.random()*25+4);
            if (melodia%4==0)
                salir=false;
        }
        System.out.print(nota1+" "+nota()+" "+nota()+" "+nota());
        System.out.print(" |");
        for (int i = 1; i<melodia/4-1; i++){
                System.out.print(" " +nota()+" "+nota()+" "+nota()+" "+nota()+" |");
        }
        System.out.print(" "+nota()+" "+nota()+" "+nota()+" "+nota1+ " ||");
    }
}