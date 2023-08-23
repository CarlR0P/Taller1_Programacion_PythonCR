print("Ingrese un año para determinar si es bisiesto:")
anno = int(input())

if (anno % 4 == 0 and anno % 100 != 0) or (anno % 400 == 0):
    print(f"El año {anno} es bisiesto.")
else:
    print(f"El año {anno} no es bisiesto.")