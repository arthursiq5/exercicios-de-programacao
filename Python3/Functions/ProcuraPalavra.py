def search(text, word):
    if word in text: # assim você procura uma palavra específica em uma string
        return 'Palavra encontrada'
    return 'Palavra não encontrada'

text = input('Insira o texto a ser analisado: ')
word = input('Insira a palavra a ser pesquisada dentro do texto: ')

print(search(text, word))
