<?php

class Produto {
    private $descricao;
    private $estoque;
    private $preco;

    public function __construct($descricao, $estoque, $preco)
    {
        $this->setDescricao($descricao)
            ->setEstoque($estoque)
            ->setPreco($preco);
    }

    /**
     * @param string $descricao
     * @return Produto
     */
    public function setDescricao($descricao)
    {
        if (is_string($descricao))
            $this->descricao = $descricao;
        return $this; // retorna ele mesmo para possibilitar funções encadeadas
    }

    /**
     * @return string
     */
    public function getDescricao()
    {
        return $this->descricao;
    }

    /**
     * @param int $estoque
     * @return Produto
     */
    private function setEstoque($estoque)
    {
        if(is_numeric($estoque) && $estoque >= 0)
            $this->estoque = $estoque;
        return $this;
    }

    public function getEstoque()
    {
        return $this->estoque;
    }

    /**
     * @param int $preco
     * @return Produto
     */
    private function setPreco($preco)
    {
        if(is_numeric($preco) && $preco >= 0)
            $this->preco = $preco;
        return $this;
    }

    /**
     * @param int $porcentagem
     * @return Produto
     */
    public function reajustaPreco($porcentagem)
    {
        if(is_numeric($porcentagem) && $porcentagem > 0 && $porcentagem <= 100)
            $this->setPreco($this->preco * (1 + ($porcentagem / 100)));
        return $this;
    }

    public function getPreco()
    {
        return $this->estoque;
    }
}

// A tentativa de atribuição de valores às propriedades vai gerar um erro,
// pois todas as propriedades são privadas
$p1 = new Produto('Chocolate', 10, 7);
$p1->reajustaPreco(5);

print_r($p1);
