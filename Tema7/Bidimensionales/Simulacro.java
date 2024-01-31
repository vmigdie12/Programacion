package Bidimensionales;
public class Simulacro {
    public static String[][] rotarAntihorario(String[][] matriz) {
        int tamaño = matriz.length;
        String[][] nuevamatriz = new String[tamaño][tamaño];
        for (int x=0;x<tamaño;x++) {
            for (int y=0;y<tamaño;y++) {
                nuevamatriz[tamaño-1-y][x] = matriz[x][y];
            }
        }
        return nuevamatriz;
    }
    public static String[][] espejohorario(String[][] matriz) {
        int tamaño = matriz.length;
        String[][] nuevamatriz = new String[tamaño][tamaño];
        for (int x=0;x<tamaño;x++) {
            for (int y=0;y<tamaño;y++) {
                nuevamatriz[x][tamaño-1-y] = matriz[x][y];
            }
        }
        return nuevamatriz;
    }
    public static void menu(){
        System.out.println("a. Izquierda");
        System.out.println("d. Derecha");
        System.out.println("s. Abajo");
        System.out.println("w. Arriba");
        System.out.println("p. Pintar");
        System.out.println("b. Borrar");
        System.out.println("m. Mover");
        System.out.println("r. Rotar sentido antihorario");
        System.out.println("e. Espejo horizontal");
        System.out.println("l. Limpiar tablero");
        System.out.println("q. Salir");
    }
    public static void main(String[] args) {
        String[][] tablero = new String[11][11];
        int xpin=5;
        int ypin=5;
        char caracter = 'M';
        char respuesta;
        boolean salir = true;
        boolean salir2 = true;
        for (int fila =0; fila <11;fila++){
                for (int columna=0; columna<11;columna++){
                    if (fila ==0||columna==0||fila==10||columna==10){
                        tablero[fila][columna]="* ";
                    }
                    else{
                        tablero[fila][columna]="  ";
                    }
                }
            }
            for (int fila =0; fila <11;fila++){
                for (int columna=0; columna<11;columna++){
                    if (fila == ypin&&columna==xpin){
                        System.out.print(caracter+" ");
                    }
                    else{
                        System.out.print(tablero[fila][columna]);
                    }
                }
                System.out.println("");
            }
        while (salir) {
            menu();
            respuesta=System.console().readLine().charAt(0);
            switch (respuesta) {
                case 'a':
                    xpin=xpin-1;
                    if (xpin==0)
                        xpin=xpin+1;
                    break;
                case 'd':
                    xpin=xpin+1;
                    if (xpin==10)
                        xpin=xpin-1;
                    break;
                case 's':
                    ypin=ypin+1;
                    if (ypin==10)
                        ypin=ypin-1;
                    break;
                case 'w':
                    ypin=ypin-1;
                    if (ypin==0)
                        ypin=ypin+1;
                    break;
                case 'p':
                    caracter='P';
                    break;
                case 'b':
                    caracter='B';
                    break;
                case 'm':
                    caracter='M';
                    break;
                case 'r':
                    tablero=rotarAntihorario(tablero);
                    break;
                case 'e':
                    tablero=espejohorario(tablero);
                    break;
                case 'q':
                    salir=false;
                    salir2=false;
                    break;
            }
            for (int fila =0; fila <11;fila++){
                for (int columna=0; columna<11;columna++){
                    if (fila ==0||columna==0||fila==10||columna==10){
                        tablero[fila][columna]="* ";
                    }
                    else{
                        if (fila == ypin&&columna==xpin&&caracter=='P'&&respuesta!='r'&&respuesta!='e'){
                            tablero[fila][columna]="X ";
                        }
                        if (fila == ypin&&columna==xpin&&caracter=='B'&&respuesta!='r'&&respuesta!='e'){
                            tablero[fila][columna]="  ";
                        }
                        if (respuesta=='l'){
                            tablero[fila][columna]="  ";
                        }
                    }
                }
            }
            if (salir2!=false){
                for (int fila =0; fila <11;fila++){
                    for (int columna=0; columna<11;columna++){
                        if (fila == ypin&&columna==xpin){
                            System.out.print(caracter+" ");
                        }
                        else{
                            System.out.print(tablero[fila][columna]);
                        }
                    }
                    System.out.println("");
                }
            }
        }
    }
}