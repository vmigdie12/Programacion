public class Ejercicio6_16 {
    public static String figura(){
        int figuras = (int)(Math.random()*4);
        switch (figuras) {
            case 0:
                return "corazón";
            case 1:
                return "diamante";
            case 2:
                return "herradura";
            case 3:
                return "campana";
            case 4:
                return "limón";
            default:
                return "";
        }
    }
    public static void main(String[] args) {
        String fig1= figura();
        String fig2= figura();
        String fig3= figura();
        System.out.print(fig1+" "+fig2+" "+fig3);
        System.out.println("");
        if (fig1.equals(fig2)||fig1.equals(fig3)||fig2.equals(fig3)){
            System.out.println("Bien, ha recuperado su moneda");
        }
        else if(fig1.equals(fig2)&&fig1.equals(fig3)&&fig2.equals(fig3)){
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        }
        else {
            System.out.println("Lo siento, ha perdido");
        }
    }
}
