package Tema10.Ejercicio1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Ivan");
        a.add("Miguel");
        a.add("Jorge");
        a.add("Jose");
        a.add("Ignacio");
        a.add("Maria");
        for(String nombre: a){
            System.out.println(nombre);
        }
    }
}
