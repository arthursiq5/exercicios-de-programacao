#include <stdio.h>

int main() {
    printf("************************************\n");
    printf("* Bem-vindo ao Jogo de Adivinhação *\n");
    printf("************************************\n");
    printf("\n\n\n");

    int numeroSecreto = 42,
        chute = 0;

    printf("Qual é o seu chute? ");
    scanf(" %d", &chute);
    printf("Você chutou o número %d!\n\n", chute);

    if(chute == numeroSecreto){

        printf("Parabéns! Você acertou!\n");
        printf("Jogue de novo, você é muito bom\n\n");

    }else if (chute > numeroSecreto)
    {

        printf("Que pena, você errou\n");
        printf("O seu chute foi maior que o número secreto\n");
    
    }else if (chute < numeroSecreto){
    
        printf("Que pena, você errou\n");
        printf("O seu chute foi menor que o número secreto\n");
    
    }

    return 0;

}
