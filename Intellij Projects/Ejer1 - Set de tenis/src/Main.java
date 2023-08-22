import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de juegos ganados por el primer jugador: ");
        int jugadorA = sc.nextInt();
        System.out.println("Numero de juegos ganados por el segundo jugador: ");
        int jugadorB = sc.nextInt();


        if (jugadorA >= 0 && jugadorA <= 7 && jugadorB >= 0 && jugadorB <= 7) {
            if ((jugadorA == 6 && jugadorB < 5) || (jugadorA == 7 && (jugadorB == 5 || jugadorB == 6))) {
                System.out.println("El jugador A ganó el set.");
            }
            else if ((jugadorB == 6 && jugadorA < 5) || (jugadorB == 7 && (jugadorA == 5 || jugadorA == 6))) {
                System.out.println("El jugador B ganó el set.");
            }
            else if (jugadorA >= 6 || jugadorB >= 6) {
                if (Math.abs(jugadorA - jugadorB) >= 2) {
                    if (jugadorA > jugadorB) {
                        System.out.println("El jugador A ganó el set.");
                    } else {
                        System.out.println("El jugador B ganó el set.");
                    }
                } else if (jugadorA == jugadorB) {
                    System.out.println("Ultimo juego gana el set");
                } else {
                    System.out.println("El set aun no ha terminado.");
                }
            } else {
                System.out.println("El set no ha terminado.");
            }
        } else {
            System.out.println("Resultado invalido. El número de juegos debe estar entre 0 y 7.");
        }

    }
}