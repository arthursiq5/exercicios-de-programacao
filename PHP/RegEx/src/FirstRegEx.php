<?php

namespace App;

class FirstRegEx extends BasicRegEx {
    function separatedByCommas(string $value){
        return $this->assert('/(.*), (.*)/', $value);
    }
}
