#!/usr/bin/perl
use strict;
use warnings;
use v5.010;

my $foo; # declarada como global

$foo = 1;
say "$foo";

sub x {
    my $foo = 5; # privada da função x
    say "$foo";
}

x(); # executa função x, imprimindo variável privada
$foo++; # incrementando global
say "$foo";
