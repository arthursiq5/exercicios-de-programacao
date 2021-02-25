<?php

function calculaImc($peso, $altura){
    return $peso / ($altura * $altura);
}

function fatorial($n){
    if($n <=1)
        return 1;
    
    return $n * fatorial($n - 1);
}
