<?php

$a = new stdClass; // cria objeto
$a->nome = "Maria"; // cria atributo

$b = $a; // cria réplica

$b->nome = "Joana";

// como ambos os objetos apontam para um mesmo endereço de memória, será impresso "Joana" duas vezes
echo $a->nome;
echo " ";
echo $b->nome;
