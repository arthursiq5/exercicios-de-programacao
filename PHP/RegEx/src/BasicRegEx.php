<?php

namespace App;

abstract class BasicRegEx {
    function assert(string $regex, string $value){
        return !empty(preg_match($regex, $value));
    }
}