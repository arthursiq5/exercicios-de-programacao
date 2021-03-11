def countdown():
    i=5
    while i > 0:
        yield i # o comando "yield" retornará um tipo de lista a cada iteração
        i -= 1

for i in countdown():
    print(i) # essa lista pode ser mostrada dessa forma

print(countdown()) # isso retornará uma posição na memória

# se passar a função para a função "list" o generator é convertido para lista
print(list(countdown()))
