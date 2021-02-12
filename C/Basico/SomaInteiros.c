#include <stdio.h>

/*
Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo especificado e não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
*/

int main(int argc, char const *argv[])
{
    int num1 = 0,
        num2 = 0,
        soma = 0;
    
    scanf(" %i", &num1);
    scanf(" %i", &num2);

    soma = num1 + num2;

    printf("X = %i\n", soma);
    
    return 0;
}
