# esse programa recebe um número x e retorna a soma de todos os números entre zero e x
# Ex: 100
# soma de todos os números entre 0 e 100: 5050

N = int(input())

ans = 0

for i in range(N):
    ans += (i + 1)

print(ans)
