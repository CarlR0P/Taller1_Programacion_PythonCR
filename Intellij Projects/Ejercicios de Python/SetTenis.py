print("Numero de juegos ganados por el primer jugador:")
jugadorA = int(input())
print("Numero de juegos ganados por el segundo jugador:")
jugadorB = int(input())

if 0 <= jugadorA <= 7 and 0 <= jugadorB <= 7:
    if (jugadorA == 6 and jugadorB == 5) or (jugadorB == 6 and jugadorA == 5):
        print("El juego aún no ha terminado.")
    elif jugadorA == 6 and jugadorB == 6:
        print("Empate a 6 juegos. Se juega un último juego.")
    elif (jugadorA == 7 and jugadorB < 5) or (jugadorB == 7 and jugadorA < 5):
        print("Resultado invalido. El set se ganó en el juego 6")
    elif jugadorA == 7 and jugadorB == 6:
        print("El jugador A ganó el set.")
    elif jugadorB == 7 and jugadorA == 6:
        print("El jugador B ganó el set.")
    elif jugadorA == 6 and jugadorB < 5:
        print("El jugador A ganó el set.")
    elif jugadorB == 6 and jugadorA < 5:
        print("El jugador B ganó el set.")
    else:
        print("El juego aún no ha terminado.")
else:
    print("Resultado inválido. El número de juegos debe estar entre 0 y 7.")
