#include <stdio.h>

int main() {
    printf("************************************\n");
    printf("* Bem-vindo ao Jogo de Adivinhação *\n");
    printf("************************************\n");
    printf("\n\n\n");

    int numeroSecreto = 42,
        chute = 0,
        condicional = 0; // adicionada variável pra melhorar a legibilidade

    printf("Qual é o seu chute? ");
    scanf(" %d", &chute);
    printf("Você chutou o número %d!\n\n", chute);

    condicional = chute == numeroSecreto;

    if(condicional){

        printf("Parabéns! Você acertou!\n");
        printf("Jogue de novo, você é muito bom\n\n");

    }else{
    
        condicional = chute > numeroSecreto;

        if (condicional)
        {

            printf("Que pena, você errou\n");
            printf("O seu chute foi maior que o número secreto\n");
        
        }else{
        
            printf("Que pena, você errou\n");
            printf("O seu chute foi menor que o número secreto\n");
        
        }
    }

    return 0;

}
