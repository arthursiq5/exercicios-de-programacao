<?php

$convertidoParaArray = explode("#", "banana#maçã#pêra#uva#melancia"); // explode retorna um array
print_r($convertidoParaArray);

echo "<br>" . PHP_EOL;

$convertidoParaString = implode(", ", $convertidoParaArray); // implode retorna string
print_r($convertidoParaString);


