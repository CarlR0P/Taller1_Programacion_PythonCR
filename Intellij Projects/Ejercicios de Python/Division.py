print("Ingrese el dividendo (El numerador para los del barrio): ")
dividendo = int(input())

print("Ingrese el divisor (El denominador para los del barrio): ")
divisor = int(input())

if divisor == 0:
    print("Es pecado dividir por cero.")
else:
    cociente = dividendo // divisor  # Usamos // para la división entera en Python
    residuo = dividendo % divisor
    print("El resultado de la división es:", cociente)
    print("El residuo de la división es:", residuo)
