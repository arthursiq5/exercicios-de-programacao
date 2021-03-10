<?php

class ContaPoupanca extends Conta
{
    function retirar($quantia)
    {
        if ($this->saldo >= $quantia)
        {
            $this->saldo -= $quantia;
            return true; // operação executada
        }
        return false; // operação não concluída
    }
}