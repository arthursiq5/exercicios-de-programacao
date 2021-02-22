#include <iostream>
using namespace std;

#define PI 3.1415;

int main()
{
    double raio = 0;
    double resposta = 0;
    cout << "Digite o raio (cm): ";
    cin >> raio;

    resposta = raio * raio * PI;

    cout << "Área: " << resposta << " cm²" << endl;
    
    return 0;
}
