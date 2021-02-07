nums = [4, 5, 6]
msg = "Numbers: {0} {1} {2}". format(nums[0], nums[1], nums[2]) # usar o .format() para formatar strings funciona pra atribuir em variáveis também
print(msg)

# os números entre chaves significam qual item de dentro do format será exibido
print("{0}{1}{0}".format('abra', 'cad')) # abracadabra

# pode setar também variáveis aos indexes
a = "{x}, {y}".format(x=5, y=12)
print(a)

print(", ".join(["spam", "eggs", "ham"]))
#prints "spam, eggs, ham"

print("Hello ME".replace("ME", "world"))
#prints "Hello world"

print("This is a sentence.".startswith("This"))
# prints "True"

print("This is a sentence.".endswith("sentence."))
# prints "True"

print("This is a sentence.".upper())
# prints "THIS IS A SENTENCE."

print("AN ALL CAPS SENTENCE".lower())
#prints "an all caps sentence"

print("spam, eggs, ham".split(", "))
#prints "['spam', 'eggs', 'ham']"
