<?php

try{
    throw new Exception('erro');
} catch (Exception $e){
    echo 'Erro genérico no código';
}
