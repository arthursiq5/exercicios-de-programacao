#include <stdio.h>

int main() {
    printf("************************************\n");
    printf("* Bem-vindo ao Jogo de Adivinhação *\n");
    printf("************************************\n");

    int numeroSecreto = 42,
        chute = 0;

    printf("Qual é o seu chute? ");
    scanf(" %d", &chute);
    printf("Você chutou o número %d!\n", chute);

    return 0;

}
