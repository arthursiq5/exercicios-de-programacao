#include <stdio.h>
#define QUANTIDADE_CHUTES 5

int main() {
    printf("************************************\n");
    printf("* Bem-vindo ao Jogo de Adivinhação *\n");
    printf("************************************\n");
    printf("\n\n\n");

    int numeroSecreto = 42,
        chute = 0,
        acertou = 0; // adicionada variável pra melhorar a legibilidade

    for (int i = 0; i < QUANTIDADE_CHUTES; i++)
    {

        printf("Qual é o seu %dº chute? ", (i + 1));
        scanf(" %d", &chute);
        printf("Você chutou o número %d!\n\n", chute);

        acertou = chute == numeroSecreto;

        if(acertou){

            printf("Parabéns! Você acertou!\n");
            printf("Jogue de novo, você é muito bom\n\n");
            break;

        }else{
            
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
