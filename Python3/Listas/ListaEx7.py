squares = [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]

# para pegar valores do array em um intervalo, passe esse intervalo como parâmetro

print(squares[2:6]) # [4, 9, 16, 25]
print(squares[3:8]) # [9, 16, 25, 36, 49]
print(squares[0:1]) # [0]

# se o primeiro item for omitido, ele será o início da lista
# se o último item for omitido, ele será o final da lista

print(squares[:7])  # [0, 1, 4, 9, 16, 25, 36]
print(squares[7:])  # [49, 64, 81]

# você ainda pode passar um terceiro parâmetro
# este serve pra você limitar quais dos valores dentro do intervalo serão pegos (step)

print(squares[::2]) # [0, 4, 16, 36, 64]
print(squares[2:8:3]) # [4, 25]

# se um valor negativo for passado como parâmetro, será considerada a contagem reversa (do último item da lista para o primeiro)

print(squares[1:-1]) # [1, 4, 9, 16, 25, 36, 49, 64]
