package main

import "fmt"

func main() {
	var age int

	fmt.Print("Digite sua idade: ")
	fmt.Scanln(&age)

	if age >= 18 {
		fmt.Println("Pode dirigir")
	} else {
		fmt.Println("Não pode dirigir")
	}
}
