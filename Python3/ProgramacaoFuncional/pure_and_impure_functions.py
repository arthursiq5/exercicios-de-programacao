# funções puras não tem efeitos colaterais (modificar algo global)
# funçõess puras também retornam um valor sempre baseado apenas nos argumentos
def pure_function(x, y):
	temp = x + 2*y
    return temp / (2*x + y)

lista = []

# funções impuras trabalham com itens de fora da função, podendo gerar efeitos colaterais
def impure(arg):
	lista.append(arg)

