#!/usr/bin/awk -f

$1 == "lennon" || $3 == "zangado" {
    print $0
}
