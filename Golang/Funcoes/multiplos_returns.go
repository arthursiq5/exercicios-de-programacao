package main

import "fmt"

// é necessário declarar os tipos de dados retornados
func swap(x, y int) (int, int) {
	return y, x
}

func main() {
	a, b := swap(42, 8)
	fmt.Printf("%d, %d\n", a, b)
}
