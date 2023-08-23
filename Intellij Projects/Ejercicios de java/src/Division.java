
import java.util.Scanner;
public class Division {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el dividendo (El numerador para los del barrio): ");
        int dividendo = sc.nextInt();

        System.out.print("Ingrese el divisor (El denominador para los del barrio): ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Es pecado dividir por cero.");
        } else {
            int cociente = dividendo / divisor;
            int residuo = dividendo % divisor;
            System.out.println("El resultado de la división es: " + cociente);
            System.out.println("El residuo de la división es: " + residuo);
        }
    }
}