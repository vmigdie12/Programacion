public class Ejercicio6_3 {
    public static void main(String[] args) {
        int palo = (int)(Math.random()*4+1);
        String paloString = "";
        int num = (int)(Math.random()*10+1);
        String numString = "";
        switch (palo) {
            case 1:
                paloString ="Picas";
                break;
            case 2:
                paloString ="Corazones";
                break;
            case 3:
                paloString ="Diamantes";
                break;
            case 4:
                paloString ="Treboles";
                break;
        }
        switch (num) {
            case 1:
                numString ="As";
                break;
            case 8:
                numString ="Sota";
                break;
            case 9:
                numString ="Caballo";
                break;
            case 10:
                numString ="Rey";
                break;
        }
        if (num==1 || num>7)
        System.out.println(numString+" "+paloString);
        if (num>1 && num<=7)
        System.out.println(num+" "+paloString);
    }
}
