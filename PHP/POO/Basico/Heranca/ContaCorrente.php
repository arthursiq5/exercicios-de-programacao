<?php

class ContaCorrente extends Conta
{
    protected $limite;

    public function __construct($agencia, $conta, $saldo, $limite) // esse método sobrescreve o método da classe pai
    {
        parent::__construct($agencia, $conta, $saldo); // chama o construtor da classe pai
        $this->limite = $limite;
    }

    public function retirar($quantia)
    {
        if ( ($this->saldo + $this->limite) >= $quantia )
        {
            $this->saldo -= $quantia;
            return true;
        }
        return false;
    }
}
