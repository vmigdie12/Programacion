package Tema10.Ejercicio2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        int random = (int)(Math.random()*31+10);
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=1;i<=random;i++){
            int random2 = (int)(Math.random()*101);
            a.add(random2);
        }
        for(int num:a){
            System.out.println(num);
        }
    }
}
