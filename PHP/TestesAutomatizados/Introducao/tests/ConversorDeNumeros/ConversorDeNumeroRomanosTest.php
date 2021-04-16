<?php

namespace App\Test\ConversorDeNumeros;

use App\ConversorDeNumeros\ConversorDeNumeroRomanos;
use PHPUnit\Framework\TestCase;

class ConversorDeNumeroRomanosTest extends TestCase
{
    public function testDeveEntenderOsSimbolosRomanos()
    {
        $romano = new ConversorDeNumeroRomanos();
        $this->assertEquals(1, $romano->converte('I'));
        $this->assertEquals(5, $romano->converte('V'));
        $this->assertEquals(10, $romano->converte('X'));
        $this->assertEquals(50, $romano->converte('L'));
        $this->assertEquals(100, $romano->converte('C'));
        $this->assertEquals(500, $romano->converte('D'));
        $this->assertEquals(1000, $romano->converte('M'));
    }
}
