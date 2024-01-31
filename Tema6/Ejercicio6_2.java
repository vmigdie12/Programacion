public class Ejercicio6_2 {
    public static void main(String[] args) {
        int palo = (int)(Math.random()*4+1);
        String paloString = "";
        int num = (int)(Math.random()*13+1);
        String numString = "";
        switch (palo) {
            case 1:
                paloString ="picas";
                break;
            case 2:
                paloString ="corazones";
                break;
            case 3:
                paloString ="diamantes";
                break;
            case 4:
                paloString ="treboles";
                break;
        }
        switch (num) {
            case 1:
                numString ="A";
                break;
            case 11:
                numString ="J";
                break;
            case 12:
                numString ="Q";
                break;
            case 13:
                numString ="K";
                break;
        }
        if (num==1 || num>10)
        System.out.println(numString+" "+paloString);
        if (num>1 && num<=10)
        System.out.println(num+" "+paloString);
    }
}