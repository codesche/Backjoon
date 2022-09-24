# include <stdio.h>

int main()
{
	int N, i;
	int temp = 0;
	int min = 1000001;
	int max = -1000001;
	
	scanf("%d", &N);
	
	for (i = 0; i < N; i++)
	{
		scanf("%d", &temp);

		if (temp < min)
		{
			min = temp;
		}
		
		if (temp > max)
		{
			max = temp;
		}
	}
	printf("%d %d", min, max);
}