print("Ingrese su peso en kilogramos: ")
peso = float(input())

print("Ingrese su estatura en metros: ")
estatura = float(input())

imc = peso / (estatura * estatura)

print("Su índice de masa corporal (IMC) es:", imc)

print("Ingrese su edad: ")
edad = int(input())

print("Riesgo de Sufrir enfermedades coronarias: ")

if edad < 45:
    if imc < 22:
        print("Riesgo Bajo")
    else:
        print("Riesgo Medio")
else:
    if imc >= 22:
        print("Riesgo Alto")
    else:
        print("Riesgo Medio")
