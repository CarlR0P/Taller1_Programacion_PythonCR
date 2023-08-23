print("Ingrese la longitud del primer lado: ")
ladoA = float(input())
print("Ingrese la longitud del segundo lado: ")
ladoB = float(input())
print("Ingrese la longitud del tercer lado: ")
ladoC = float(input())

if ladoA + ladoB > ladoC and ladoA + ladoC > ladoB and ladoB + ladoC > ladoA:
    if ladoA == ladoB == ladoC:
        print("Es un triángulo equilátero.")
    elif ladoA == ladoB or ladoA == ladoC or ladoB == ladoC:
        print("Es un triángulo isósceles.")
    else:
        print("Es un triángulo escaleno.")
else:
    print("No cumple con la desigualdad triangular.")
