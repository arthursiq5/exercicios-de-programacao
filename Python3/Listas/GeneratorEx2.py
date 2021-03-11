def infinite_sevens():
    while True:
        yield 7 # generators não tem restrição de memória, e podem ser infinitos

for i in infinite_sevens():
    print(i)
