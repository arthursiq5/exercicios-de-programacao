<?php

namespace App\Loja;

class Produto
{
    private string $nome;
    private float $valor;

    public function __construct($nome, $valor)
    {
        $this->nome = $nome;
        $this->valor = $valor;
    }

    function getNome(): string
    {
        return $this->nome;
    }

    function getValor(): float
    {
        return $this->valor;
    }
}