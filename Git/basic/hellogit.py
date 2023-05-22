print("Bienvenido a la calculadora Normal")
def operacion(x,y, i):
    if i == 1:
        return x+y
    elif i == 2:
        return x-y
    elif i == 3:
        return x*y
    elif i == 4:
        return x/y
    else:
        return "Valor fuera"


def nuevo():
    num1 = 2
    print(num1 + 2)

def menu():

    print("Digite el primer numero: ")
    num1 = int(input())
    print("Digite el segundo numero: ")
    num2 = int(input())
    print("Escoja una:\n1)Suma\n2)Resta\n3)Multiplicacion:\n4)Division")
    opt = int(input())
    print(operacion(num1, num2, opt))

def otro2():
    print("Otro2")

menu()


print("Gracias por usar la calculadora")
