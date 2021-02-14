#include <stdio.h>
#define QUANTIDADE_CHUTES 5

int main() {
    printf("************************************\n");
    printf("* Bem-vindo ao Jogo de Adivinhação *\n");
    printf("************************************\n");
    printf("\n\n\n");

    int numeroSecreto = 42,
        chute = 0,
        condicional = 0; // adicionada variável pra melhorar a legibilidade

    for (int i = 0; i < QUANTIDADE_CHUTES; i++)
    {

        printf("Qual é o seu %dº chute? ", (i + 1));
        scanf(" %d", &chute);
        printf("Você chutou o número %d!\n\n", chute);

        condicional = chute == numeroSecreto;

        if(condicional){

            printf("Parabéns! Você acertou!\n");
            printf("Jogue de novo, você é muito bom\n\n");
            break;

        }else{
        
            condicional = chute > numeroSecreto;

            if (condicional)
            {

                printf("Que pena, você errou\n");
                printf("O seu chute foi maior que o número secreto\n\n");
            
            }else{
            
                printf("Que pena, você errou\n");
                printf("O seu chute foi menor que o número secreto\n\n");
            
            }
        }
    }

    return 0;

}
