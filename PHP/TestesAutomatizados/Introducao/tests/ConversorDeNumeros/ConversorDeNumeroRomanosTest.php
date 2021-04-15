<?php

namespace App\Test\ConversorDeNumeros;

use App\ConversorDeNumeros\ConversorDeNumeroRomanos;
use PHPUnit\Framework\TestCase;

class ConversorDeNumeroRomanosTest extends TestCase
{
    public function testDeveEntenderOSimboloI()
    {
        $romano = new ConversorDeNumeroRomanos();
        $numero = $romano->converte('I');
        $this->assertEquals(1, $numero);
    }
}
