<?php

namespace App;

class FirstRegEx {
    function separatedByCommas(string $value){
        return !empty(preg_match('/(.*), (.*)/', $value));
    }
}
