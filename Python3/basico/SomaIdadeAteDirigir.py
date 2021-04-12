# se a idade for menor que 18, some várias unidades até completar o necessário
idade = int(input('Digite sua idade: '))
cont = 0
mensagem = ''

while (cont + idade) < 18:
    print("Com {} você ainda não vai poder dirigir".format(idade + cont))
    cont += 1


if cont == 0:
    mensagem = 'Você já pode dirigir'
else:
    mensagem = 'Com 18 você vai poder dirigir'

print(mensagem)
