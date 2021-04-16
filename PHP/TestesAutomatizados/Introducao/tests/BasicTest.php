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
}