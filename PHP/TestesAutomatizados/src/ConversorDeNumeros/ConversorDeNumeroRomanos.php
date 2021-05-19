<?php

namespace App\ConversorDeNumeros;

class ConversorDeNumeroRomanos
{
    protected array $tabela = [
        'I' => 1,
        'V' => 5,
        'X' => 10,
        'L' => 50,
        'C' => 100,
        'D' => 500,
        'M' => 1000
    ];

    public function converte(string $numeroRomano): int
    {
        $acumulador = 0;
        $ultimoVizinhoDaDireita = 0;

        for ($i=strlen($numeroRomano) - 1; $i >= 0; $i--) {
            $atual = 0;
            $algarismoAtual = $numeroRomano[$i];

            if (array_key_exists($algarismoAtual, $this->tabela)) {
                $atual = $this->tabela[$algarismoAtual];
            }

            // definido multiplicador
            $multiplicador = $atual >= $ultimoVizinhoDaDireita ? 1 : -1;

            // número atual * multiplicador
            $acumulador += ($atual * $multiplicador);

            $ultimoVizinhoDaDireita = $atual;
        }

        return $acumulador;
    }
}
