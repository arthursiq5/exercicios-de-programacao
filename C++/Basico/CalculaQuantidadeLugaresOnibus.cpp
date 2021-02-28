#include <iostream>
using namespace std;

/*
 *
 * Você está fazendo um programa para um serviço de ônibus.
 * Um ônibus pode transportar 50 passageiros de uma vez.
 * Dado o número de passageiros esperando na estação de ônibus como entrada, 
 * você precisa calcular e produzir quantos assentos vazios o último ônibus terá.
 *
 * Amostra de entrada:
 * 126
 *
 * Saída de amostra:
 * 24
 *
 * Explicação: O primeiro ônibus transportará 50 passageiros, 
 * deixando 126-50 = 76 na estação. O próximo sairá de 26 na estação, assim, 
 * o último ônibus levará todos os 26 passageiros, ficando com 50-26 = 24 vagas vazias.
 *
 */

int passageirosDoUltimoOnibus(int quantidadeTotalDePassageiros)
{
    return (quantidadeTotalDePassageiros % 50 == 0 ? 50 : quantidadeTotalDePassageiros % 50);
}

int main()
{
    int quantidadeTotalDePassageiros = 0;
    cin >> quantidadeTotalDePassageiros;

    cout << 50 - passageirosDoUltimoOnibus(quantidadeTotalDePassageiros) << endl;

    return 0;
}