#!/bin/bash
# script feito só com o objetivo de mostrar como é feito o processo de montagem do programa

# 32 bits
nasm -f hello.asm
ld hello.o -o hello

# 64 bits
# forma 1:
nasm -f elf64 hello.asm
ld hello.o -o hello

# forma 2:
nasm -f hello.asm
ld -m elf_i386 hello.o -o hello
