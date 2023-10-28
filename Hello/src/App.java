public class App {
    public static void main(String[] args) throws Exception {
        int a;  //entero 4bytes
        short c;  //entero 2bytes
        long d;  //entero 8bytes
        byte e;  //entero 1byte
        char f;  //entero caracter 1byte
        float g; //reales 16bytes
        double h;  //reales 32bytes
        boolean i; //logicos 1byt
        a=0b11111111  //1*2^7+1*2^6+...+1*2^0
        a=0xff;  //base 16 15*16^1 +15*16^0
        a=255;  //base 10 2*10^2 + 5*10^1 + 5*10^0
        g=10.0f;
        h=10.0;
        i=true;
        i=false;
        a=c;
        a=(int)g;
        g=a;
    }
}
