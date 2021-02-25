#!/bin/bash

PRECO_MACAS=5

# backslash escapa o caractere especial
echo "O preço de uma maçã hoje é: \$HK $PRECO_MACAS"

Letras=ABC

# colocar a variável entre chaves evita ambiguidade
echo "As primeiras letras do alfabeto são: ${Letras}DEFGHIJ"

saudacao="Hello                  World"

# variáveis que contiverem texto e que não forem declaradas dentro de aspas terão espaços extras "comidos"
echo $saudacao
echo "agora com espaços: $saudacao"
