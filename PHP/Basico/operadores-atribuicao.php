<?php

$var = 100;
echo $var . '<br>';

$var += 5; // soma 5
echo $var . '<br>';

$var -=5; // subtração
echo $var . '<br>';

$var *= 5; // multiplicação
echo $var . '<br>';

$var /= 5; // divisão
echo $var . '<br>';

echo '<br><br>Testes com operadores unários <br><br>';

$var = 1;
echo 'valor original: ' . $var . '<br>';

echo 'Valor na utilização(++$var): ' . ++$var . '<br>';
echo 'Valor pós utilização(++$var): ' . $var . '<hr>';

$var = 1;

echo 'Valor na utilização($var++): ' . $var++ . '<br>';
echo 'Valor pós utilização($var++): ' . $var . '<hr>';

$var = 1;

echo 'Valor na utilização(--$var): ' . --$var . '<br>';
echo 'Valor pós utilização(--$var): ' . $var . '<hr>';

$var = 1;

echo 'Valor na utilização($var--): ' . $var-- . '<br>';
echo 'Valor pós utilização($var--): ' . $var . '<hr>';
