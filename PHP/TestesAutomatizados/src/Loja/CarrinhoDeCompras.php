<?php

namespace App\Loja;

use app\Loja\Produto;

class CarrinhoDeCompras
{
    private array $produtos;
    
    public function __construct()
    {
        $this->produtos = array();
    }
    
    public function adiciona(Produto $produto): CarrinhoDeCompras
    {
        $this->produtos[] = $produto;
        return $this;
    }

    public function getProdutos(): array
    {
        return $this->produtos;
    }

    public function maiorValor(): float
    {
        if (count($this->getProdutos()) === 0) {
            return 0;
        }
        $maiorValor = $this->getProdutos()[0]->getValor();
        foreach ($this->getProdutos() as $produto) {
            if ($maiorValor < $produto->getValor()) {
                $maiorValor = $produto->getValor();
            }
        }
        return $maiorValor;
    }
}