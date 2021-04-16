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
        for ($i=0; $i < strlen($numeroRomano); $i++) {
            $algarismoAtual = $numeroRomano[$i];
            if (array_key_exists($algarismoAtual, $this->tabela)) {
                $acumulador += $this->tabela[$algarismoAtual];
            }
        }

        return $acumulador;
    }
}
