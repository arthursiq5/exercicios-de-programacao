<?php

namespace App;

class MaiorEMenor
{
    public static function getMaior(int $primeiroNumero, int $segundoNumero): int
    {
        if ($primeiroNumero >= $segundoNumero)
        {
            return $primeiroNumero;
        }
        return $segundoNumero;
    }

    public static function getMenor(int $primeiroNumero, int $segundoNumero): int
    {
        if ($primeiroNumero <= $segundoNumero)
        {
            return $primeiroNumero;
        }
        return $segundoNumero;
    }
}