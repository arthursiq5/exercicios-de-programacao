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

    public function testBeginsWith()
    {
        $this->assertTrue($this->regex->beginsWith('te', 'teste'));
        $this->assertFalse($this->regex->beginsWith('tse', 'teste'));
        $this->assertTrue($this->regex->beginsWith('ca', 'cachorro'));
        $this->assertTrue($this->regex->beginsWith('ca', 'calvície'));
        $this->assertFalse($this->regex->beginsWith('ca', 'bacana'));
    }

    public function testsEndsWith()
    {
        $this->assertTrue($this->regex->endsWith('r', 'correr'));
        $this->assertFalse($this->regex->endsWith('r', 'corre'));
    }
}
