package main

import "fmt"

// se os parâmetros forem do mesmo tipo, pode-se declarar o tipo só no final
func mult(x, y int) int { // funções com retorno são tipadas
	return x * y
}

func main() {
	result := mult(3, 4)
	fmt.Println(result)
}
