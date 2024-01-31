package AUnidimensionales;
public class Ejercicio7_3 {
    public static void main(String[] args) {
        int[] num;
        num = new int[10];
        int num1;        
        for (int i = 0;i<10;i++){
            num1 = Integer.parseInt(System.console().readLine());
            num[i]= num1;
        }
        for (int j=9;j>=0;j--){
            System.out.println(num[j]);
        }
    }
}
