<?php

namespace App\Test;

use PHPUnit\Framework\TestCase;

class BasicTest extends TestCase
{
    public function setUp(): void
    {
        parent::setUp();
    }

    public function testExemplo()
    {
        $this->assertTrue(true);
    }

    public function testOperacoesComArray()
    {
        $this->assertEquals([], array());
        $this->assertEquals([1, 2, 3], array(1, 2, 3));
        $this->assertEquals(['nome' => 'fulano', 'idade' => 25], ['nome' => 'fulano', 'idade' => 25]);
    }
}