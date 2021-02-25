limite = int(input('Qual o limite? '))

x = 1
while x < limite:
    if x%2 == 0:
        print(str(x) + " é par")
    else:
        print(str(x) + " é ímpar")

    x += 1
