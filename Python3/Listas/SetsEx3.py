first = {1, 2, 3, 4, 5, 6}
second = {4, 5, 6, 7, 8, 9}

# operadores de manipulação de sets
print(first | second) # une os dois sets sem repetir dados
print(first & second) # retorna os elementos que aparecem em ambos os sets
print(first - second) # mostra os elementos que aparecem em 'first' mas não em 'second'
print(second - first) # mostra os elementos que aparecem em 'second' mas não em 'first'
print(first ^ second) # mostra os elementos que aparecem em 'first' e 'second', mas não em ambos
