<?php

namespace App\Test;

use PHPUnit\Framework\TestCase;
use App\FirstRegEx;


class FirstRegExTest extends TestCase
{
    private FirstRegEx $regex;

    public function setUp(): void
    {
        parent::setUp();
        $this->regex = new FirstRegEx();
    }

    public function testExemplo()
    {
        $this->assertTrue($this->regex->separatedByCommas('teste, teste'));
        $this->assertFalse($this->regex->separatedByCommas('teste'));
    }
}
