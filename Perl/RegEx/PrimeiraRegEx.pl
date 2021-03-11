#!/usr/bin/perl
use v5.010;
use strict;
use warnings;

my $string = "Hello, World";

# verifica se a palavra "World" existe na string
if ($string =~ /World/) {
    print "It matches\n";
} else {
    print "It doesn't match\n";
}
