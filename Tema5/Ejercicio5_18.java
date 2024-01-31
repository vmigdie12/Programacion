public class Ejercicio5_18 {
public static void main(String[] args) {
int Numero1;
int Numero2;
do {
System.out.print("Introduce un numero entero: ");
Numero1 = Integer.parseInt(System.console().readLine());
System.out.print("Introduce otro numero entero mayor al anterior: ");
Numero2 = Integer.parseInt(System.console().readLine());
if(Numero1 == Numero2) {
System.out.println("Los numeros introducidos no son validos, deben ser distintos");
}
if(Numero1 > Numero2) {
System.out.println("El primer numero introducido es mayor al segundo, debe ser menor");
}
} while (Numero1 == Numero2);

for(int i = Numero1; i <= Numero2; i += 7) {
System.out.print(i + " ");
}
System.out.println();
}
}
