potencia = int(input('Em que potência voce gostaria de multiplicar os números? '))

potenciasCalculadas = [i ** potencia for i in range(10)]

for potLen in range(len(potenciasCalculadas)):
    print("Potencia de {}^{} = {}".format(potLen, potencia, potenciasCalculadas[potLen]))