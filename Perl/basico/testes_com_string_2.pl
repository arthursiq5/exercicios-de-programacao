#!/usr/bin/perl

# Perl converte automaticamente strings em números, e vice versa. Por isso é
# mais difícil do que parece dizer qual é o tipo da informação salva

# números são tratados como números

my $x = 10;
my $y = $x + 1;

print "Using a number $x + 1 = $y.\n"; # 11

# strings numéricas são tratadas como números

$x = '10';
$y = $x + 1;

print "Using a string $x + 1 = $y.\n"; # 11

# se for realizada uma operação matemática com uma string não numérica,
# ela é ignorada

$x = "ten";
$y = $x + 1;

print "Using an English word, $x + 1 = $y.\n"; # 1

# a parte da string que for numérica é considerada, mesmo que tenha
# junto partes não numéricas

$x = "2ten";
$y = $x + 1;

print "Using a funny string, $x + 1 = $y.\n"; # 3

