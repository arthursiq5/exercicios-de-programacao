#!/bin/bash

# O indicador padrão de início de linha é o "$",
# podendo variar um pouco dependendo de como o
# Bash estivar configurado
# Porém podemos trocar isso redeclarando o indicador:

declare -x PS1="Bash $" # só vai funcionar se for rodado direto no terminal bash
