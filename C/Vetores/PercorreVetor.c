#include <stdio.h>

int main()
{
	int vetor[5];
	int x, i;

	printf("Digite os cinco números:\n");
	for (i = 0; i < 5; i++)
	{
		scanf(" %d", &vetor[i]);
	}
	
	i=1;
	x = vetor[0];

	while (i < 5)
	{
		if (vetor[i] > x)
			x = vetor[i];

		i++;
	}

	printf("\n O maior numero que voce digitou foi %d .\n",x);
	getchar();

	return 0;
}

