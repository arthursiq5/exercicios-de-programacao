nums = [4, 5, 6]
msg = "Numbers: {0} {1} {2}". format(nums[0], nums[1], nums[2]) # usar o .format() para formatar strings funciona pra atribuir em variáveis também
print(msg)

# os números entre chaves significam qual item de dentro do format será exibido
print("{0}{1}{0}".format('abra', 'cad')) # abracadabra

# pode setar também variáveis aos indexes
a = "{x}, {y}".format(x=5, y=12)
print(a)
