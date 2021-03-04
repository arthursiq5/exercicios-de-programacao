#include <stdio.h>

int main()
{
	int score = 0;

	printf("Digite sua pontuação: ");
	scanf(" %d", &score);

	if (score >= 75)
		printf("Você passou.\n");
	else
		printf("Você não passou.\n");

	return 0;
}

