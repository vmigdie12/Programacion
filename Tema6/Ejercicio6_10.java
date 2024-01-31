public class Ejercicio6_10 {
    public static void main(String[] args) {
        String cara = "";
        for (int i = 1; i<=10;i++){
            int longitud = (int)(Math.random()*40+1);
            int caracter = (int)(Math.random()*6);
            switch (caracter) {
                case 0:
                    cara="*";
                    break;
                case 1:
                    cara="-";
                    break;
                case 2:
                    cara="=";
                    break;
                case 3:
                    cara=".";
                    break;
                case 4:
                    cara="|";
                    break;
                case 5:
                    cara="@";
                    break;
            }
            for( int j=1;j<=longitud;j++){
                System.out.print(cara);
            }
            System.out.println(" ");
        }
    }
}
