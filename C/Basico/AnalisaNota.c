#include <stdio.h>

int main()
{
	int score = 0;

	printf("Digite sua pontuação: ");
	scanf(" %d", &score);

	if (score >= 75)
		printf("Você passou.\n");
	else if (score >= 50)
		printf("Você ficou em recuperação.\n");
	else
		printf("Você não passou.\n");

	return 0;
}

