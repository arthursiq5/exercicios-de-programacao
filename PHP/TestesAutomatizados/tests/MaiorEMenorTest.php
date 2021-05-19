<?php

namespace App\Test;

use App\MaiorEMenor;
use PHPUnit\Framework\TestCase;

class MaiorEMenorTest extends TestCase
{
    public function setUp(): void
    {
        parent::setUp();
    }

    public function testGetMaior()
    {
        $this->assertEquals(500, MaiorEMenor::getMaior(500, 300));
        $this->assertEquals(3, MaiorEMenor::getMaior(3, 2));
    }

    public function testGetMenor()
    {
        $this->assertEquals(300, MaiorEMenor::getMenor(500, 300));
        $this->assertEquals(2, MaiorEMenor::getMenor(3, 2));
    }
}