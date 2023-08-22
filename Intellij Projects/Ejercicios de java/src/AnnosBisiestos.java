import java.util.Scanner;
public class AnnosBisiestos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un año para determinar si es bisiesto: ");
        int anno = sc.nextInt();

        if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
            System.out.println("El año "+ anno + " es bisiesto.");
        } else {
            System.out.println("El año "+ anno + " no es bisiesto.");
            }
    }
}