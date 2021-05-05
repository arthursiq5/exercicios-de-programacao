<?php

namespace App;

class FirstRegEx extends BasicRegEx {
    function separatedByCommas(string $value):bool
    {
        return $this->assert('/(.*), (.*)/', $value);
    }

    function beginsWith(string $pattern, string $value): bool
    {
        return $this->assert("/^$pattern/", $value);
    }
}
