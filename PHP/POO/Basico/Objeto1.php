<?php
// 

class Produto {
    public $descricao;
    public $estoque;
    public $preco;

    public function aumentarEstoque($unidades)
    {
        // a função is_numeric era usada quando a tipagem no PHP ainda não podia ser definida
        if(is_numeric($unidades) && $unidades >=0)   
            $this->estoque += $unidades;
    }

    public function diminuirEstoque($unidades)
    {
        if(is_numeric($unidades) && $unidades >=0)
            $this->estoque -= $unidades;
    }

    public function reajustarPreco($percentual)
    {
        if(is_numeric($percentual) AND $percentual >= 0)
            $this->preco *= (1 + ($percentual / 100));
    }
}

$p1 = new Produto();
$p1->descricao = 'Chocolate';
$p1->estoque   = 10;
$p1->preco     = 7;

$p2 = new Produto();
$p2->descricao = 'Café';
$p2->estoque   = 20;
$p2->preco     = 4;


// mostrando dados
var_dump($p1);
var_dump($p2);

$p1->aumentarEstoque(10);
$p1->diminuirEstoque(5);
$p1->reajustarPreco(50);

var_dump($p1);
