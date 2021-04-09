#!/usr/bin/perl
use v5.010;
use strict;
use warnings;

my $var = 10;
say '$var'; # aspas simples não interpolam strings
say "$var"; # aspas duplas permitem a interpolação de strings
