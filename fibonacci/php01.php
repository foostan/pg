<?php

define("N", 1000);

function feb($a, $b)
{
    $arr = Array($b);

    if ($a < N) {
        return array_merge($arr, feb($a + $b, $a));
    } else {
        return $arr;
    }
}

print_r(feb(1, 0));
