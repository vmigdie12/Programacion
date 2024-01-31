package Tema10.Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 1; i<=10; i++){
            int numero = Integer.parseInt(System.console().readLine());
            a.add(numero);
        }
        Collections.sort(a);
        System.out.println("Array ordenado: ");
        for (int num:a){
            System.out.println(num);
        }
    }
}
