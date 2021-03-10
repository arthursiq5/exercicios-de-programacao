nums = [11, 22, 33, 44, 55]

def add_five(x):
	return x + 5

result = list(map(add_five, nums))
print(result)

result = list(map(lambda x: x + 5, nums))
print(result)

