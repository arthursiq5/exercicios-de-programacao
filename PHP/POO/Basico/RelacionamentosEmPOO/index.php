<?php

require_once 'Fabricante.php';
require_once 'Produto.php';
require_once 'Caracteristica.php';

// criação dos objetos
$p1 = new Produto('Chocolate', 10, 7);
$f1 = new Fabricante('Chocolate Factory', 'Rua de Baixo', '123456789101112');

// associação
$p1->setFabricante($f1);

// composição
$p1->addCaracteristica('cor', 'branco');
$p1->addCaracteristica('criador', 'João Fernando');

print_r($p1);
echo "<br>\n";
print_r($f1);
