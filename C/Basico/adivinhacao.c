#include <stdio.h>
#include <stdlib.h>
#define TRUE 1

int main() {
    printf("************************************\n");
    printf("* Bem-vindo ao Jogo de Adivinhação *\n");
    printf("************************************\n");
    printf("\n\n\n");

    int numeroSecreto = 42,
        chute = 0,
        acertou = 0, // adicionada variável pra melhorar a legibilidade
        contador = 0,
        pontos = 1000;

    while (TRUE){

        contador++;

        printf("Qual é o seu %dº chute? ", contador);
        scanf(" %d", &chute);
        printf("Você chutou o número %d!\n\n", chute);

        acertou = chute == numeroSecreto;

        if(acertou){

            printf("Parabéns! Você acertou!\n");
            printf("Você conseguiu %d pontos\n", pontos);
            printf("Jogue de novo, você é muito bom\n\n");
            break;

        }else{

            int pontosPerdidos = abs(chute - numeroSecreto) / 2;
            pontos -= pontosPerdidos;

            if(pontos < 0) pontos = 0;
            
            int maior = chute > numeroSecreto,
                menor = chute < numeroSecreto,
                negativo = chute < 0;

            if (negativo){
                printf("Dado inválido, o chute não pode ser negativo\n");
                printf("O programa será encerrado\n\n");
                break;
            }else if (maior)
            {

                printf("Que pena, você errou\n");
                printf("O seu chute foi maior que o número secreto\n\n");
            
            }else if(menor){
            
                printf("Que pena, você errou\n");
                printf("O seu chute foi menor que o número secreto\n\n");
            
            }
        }
    }

    return 0;

}
