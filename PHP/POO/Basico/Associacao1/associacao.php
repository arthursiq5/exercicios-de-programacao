<?php

require_once 'Fabricante.php';
require_once 'Produto.php';

// criação dos objetos
$p1 = new Produto('Chocolate', 10, 7);
$f1 = new Fabricante('Chocolate Factory', 'Rua de Baixo', '123456789101112');

// associação
$p1->setFabricante($f1);

print_r($p1);
echo "<br>\n";
print_r($f1);
