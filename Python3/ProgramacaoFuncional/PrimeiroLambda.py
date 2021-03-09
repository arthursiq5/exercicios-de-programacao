def my_func(f, arg):
    return f(arg)

# lambdas é uma forma forma de criar funções anônimas em Python, quando necessário
print(my_func(lambda x: 2*x*x, 5))
