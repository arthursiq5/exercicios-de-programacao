<?php

namespace App;

abstract class BasicRegEx {
    function assert(string $regex, string $value): bool
    {
        return !empty(preg_match($regex, $value));
    }
}