<?php

$produto = [];
$produto['descricao'] = 'Chocolate';
$produto['estoque']   = 100;
$produto['preco']     = 7;

$objeto = new StdClass;

foreach($produto as $chave => $valor) {
    $objeto->$chave = $valor;
}

print_r($produto);
print_r($objeto);
