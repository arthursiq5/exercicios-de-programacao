<?php

namespace App\Test\ConversorDeNumeros;

use App\ConversorDeNumeros\ConversorDeNumeroRomanos;
use PHPUnit\Framework\TestCase;

class ConversorDeNumeroRomanosTest extends TestCase
{
    private ConversorDeNumeroRomanos $romano;

    public function setUp()
    {
        parent::setUp();
        $this->romano = new ConversorDeNumeroRomanos();
    }

    public function testDeveEntenderOsSimbolosRomanos()
    {
        $this->assertEquals(1, $this->romano->converte('I'));
        $this->assertEquals(5, $this->romano->converte('V'));
        $this->assertEquals(10, $this->romano->converte('X'));
        $this->assertEquals(50, $this->romano->converte('L'));
        $this->assertEquals(100, $this->romano->converte('C'));
        $this->assertEquals(500, $this->romano->converte('D'));
        $this->assertEquals(1000, $this->romano->converte('M'));
    }

    public function testDeveEntenderSimbolosDuplicados()
    {
        $this->assertEquals(2, $this->romano->converte('II'));
        $this->assertEquals(3, $this->romano->converte('III'));
        $this->assertEquals(7, $this->romano->converte('VII'));
    }
}
