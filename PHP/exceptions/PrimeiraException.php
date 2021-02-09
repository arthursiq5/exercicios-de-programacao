<?php

try{
    echo 2/0;
} catch (Exception $e){
    echo 'Erro ao tentar fazer divisão com zero';
}

