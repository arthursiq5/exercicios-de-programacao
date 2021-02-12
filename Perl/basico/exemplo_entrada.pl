#!/usr/bin/perl

use 5.010;
use strict;
use warnings;

say "Qual é o seu nome? ";
my $nome = <STDIN>; # entrada do teclado
chomp $nome;        # come o caractere de enter do fim da string
say "Olá $nome, seja bem vindo";

