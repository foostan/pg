<?php

function feb($a, $b, $n)
{
    $arr = Array($b);

    if ($a < $n) {
        $arr = array_merge($arr, feb($a + $b, $a, $n));
    }

    return $arr;
}

foreach (feb(1, 0, 1000) as $i) {
    echo $i, "\n";
}
