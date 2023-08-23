import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese su peso en kilogramos: ");
    double peso = sc.nextDouble();

    System.out.print("Ingrese su estatura en metros: ");
    double estatura = sc.nextDouble();

    double imc = (peso/(estatura*estatura)) ;

    System.out.println("Su índice de masa corporal (IMC) es: " + imc);

    System.out.print("Ingrese su edad: ");
    int edad = sc.nextInt();

    System.out.print("Riesgo de Sufrir enfermedades coronarias: ");

    if (edad < 45)
        if (imc < 22) {
        System.out.println("Riesgo Bajo");
        } else {
        System.out.println("Riesgo Medio");

        } else if (imc >= 22) {
            System.out.println("Riesgo Alto");
        } else {
            System.out.println("Riesgo Medio");
        }
    }
}

