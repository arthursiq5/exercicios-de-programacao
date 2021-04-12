from random import randint

numeroMagico = randint(1, 100)
tentativas = 5
venceu = False

for tentativa in range(tentativas):
    palpite = int(input('Digite seu {}º palpite:\n'.format(tentativa + 1)))

    print('O seu palpite é {}'.format(palpite))

    # validação dos dados
    if palpite < 1 or palpite > 100:
        print('Erro: valor inválido')
        break

    # acertou?
    if numeroMagico == palpite:
        print('Você ganhou')
        venceu = True
        break
    elif numeroMagico > palpite:
        print('O número mágico é maior')
    else:
        print('O número mágico é menor')

if venceu:
    print('Meus parabéns')
else:
    print('O número mágico era {}'.format(numeroMagico))
    print('Tente novamente')
