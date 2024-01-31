package Bidimensionales;
public class Ejercicio7_8 {         //No acabado
    public static void letras (int num){
        switch (num) {
            case 0:
                System.out.print("a");
                break;
            case 1:
                System.out.print("b");
                break;
            case 2:
                System.out.print("c");
                break;
            case 3:
                System.out.print("d");
                break;
            case 4:
                System.out.print("e");
                break;
            case 5:
                System.out.print("f");
                break;
            case 6:
                System.out.print("g");
                break;
            case 7:
                System.out.print("h");
                break;
            default:
                System.out.print("");
                break;
        }
    }
    public static void main(String[] args) {
        int columnaal=0;
        System.out.println("Introduce la posicion del alfil: ");
        String columnaalstr = System.console().readLine();
        switch (columnaalstr) {
            case "a":
                columnaal=0;
                break;
            case "b":
                columnaal=1;
                break;
            case "c":
                columnaal=2;
                break;
            case "d":
                columnaal=3;
                break;
            case "e":
                columnaal=4;
                break;
            case "f":
                columnaal=5;
                break;
            case "g":
                columnaal=6;
                break;
            case "h":
                columnaal=7;
                break;
        }
        int filaal = Integer.parseInt(System.console().readLine());
        System.out.println("El álfil puede moverse a las siguientes posiciones: ");
        for (int n=1;n<8;n++){
            if (columnaal+n<=8 && filaal+n<=8){
                letras(columnaal-n);
                System.out.print(filaal-n);
                System.out.print(" ");
            }
            if (columnaal+n<=8 && filaal+n<=8){
                letras(columnaal+n);
                System.out.print(filaal-n);
                System.out.print(" ");
            }
            if (columnaal+n<=8 && filaal+n<=8){
                letras(columnaal-n);
                System.out.print(filaal+n);
                System.out.print(" ");
            }
            if (columnaal+n<=8 && filaal+n<=8){
                letras(columnaal+n);
                System.out.print(filaal+n);
                System.out.print(" ");
            }
        }
    }
}