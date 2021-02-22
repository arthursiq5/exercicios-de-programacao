<?php

class Produto {
    private $descricao;
    private $estoque;
    private $preco;
}

// A tentativa de atribuição de valores às propriedades vai gerar um erro,
// pois todas as propriedades são privadas
$p1 = new Produto();
$p1->descricao = 'Chocolate';
$p1->estoque   = 10;
$p1->preco     = 7;
