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

    }else{
    
        printf("Que pena, você errou\n");
        printf("Não desanime, tente de novo!\n\n");
    
    }

    return 0;

}
