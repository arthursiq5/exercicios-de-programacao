<?php

$file = fopen(__FILE__, "r"); // abre arquivo

$linha = 1;

while(!feof($file)) // testa se está já no fim do arquivo
{
    $buffer = fgets($file, 4096); // pega a linha atual em forma de string
    if($linha > 1)
    {
        echo $buffer; // imprime a linha
    }
    $linha++;
}

fclose($file); // fecha arquivo

