import java.util.Scanner;
public class Triangulos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer lado: ");
        double ladoA = sc.nextDouble();
        System.out.print("Ingrese la longitud del segundo lado: ");
        double ladoB = sc.nextDouble();
        System.out.print("Ingrese la longitud del tercer lado: ");
        double ladoC = sc.nextDouble();

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {

            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Es un triangulo equilatero.");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("Es un triangulo isosceles.");
            } else {
                System.out.println("Es un triangulo escaleno.");
            }

        } else {
            System.out.println("No cumple con la desigualdad triangular");
        }
    }
}
