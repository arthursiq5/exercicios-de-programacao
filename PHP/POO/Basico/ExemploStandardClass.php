<?php

// A StdClass seria a mesma coisa que criar um objeto vazio
// em JavaScript
//
// Exemplo em JavaScript:
// let produto = {};
$produto = new stdClass;
$produto->descricao = "Chocolate";
$produto->estoque   = 100;
$produto->preco     = 7;

print_r($produto);
