package main

import "fmt"

func welcome() {
	fmt.Println("Welcome")
}

func main() {
	defer welcome() // essa função só será executada depois que a função atual (main) terminar de ser executada
	fmt.Println("Hey")
}

/*
outputs:
    Hey
    Welcome
*/
