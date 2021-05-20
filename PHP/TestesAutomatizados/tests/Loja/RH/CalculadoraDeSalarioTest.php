<?php

namespace App\Test\Loja\RH;

use PHPUnit\Framework\TestCase;
use App\Loja\RH\CalculadoraDeSalario;
use App\Loja\RH\Funcionario;
use App\Loja\RH\TabelaCargos;

class CarrinhoDeComprasTest extends TestCase
{
    public function testCalculoSalarioDesenvolvedoresComSalarioAbaixoDoLimite()
    {
        $calculadora = new CalculadoraDeSalario();
        $desenvolvedor = new Funcionario(
            "Andre",
            1500.0,
            TabelaCargos::DESENVOLVEDOR
        );

        $salario = $calculadora->calculaSalario($desenvolvedor);
        $this->assertEquals(1500.0 * 0.9, $salario);
    }

    public function testCalculoSalarioDesenvolvedoresComSalarioAcimaDoLimite()
    {
        $calculadora = new CalculadoraDeSalario();
        $desenvolvedor = new Funcionario(
            "Andre",
            4000.0,
            TabelaCargos::DESENVOLVEDOR
        );

        $salario = $calculadora->calculaSalario($desenvolvedor);
        $this->assertEquals(4000.0 * 0.8, $salario);
    }

    public function testDeveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite()
    {
        $calculadora = new CalculadoraDeSalario();
        $dba = new Funcionario("Andre", 500.0, TabelaCargos::DBA);
        
        $salario = $calculadora->calculaSalario($dba);

        $this->assertEquals(500.0 * 0.85, $salario);
    }
}
