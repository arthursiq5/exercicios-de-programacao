letters = {"a", "b", "c", "d"}

if "e" not in letters:
    print(1)
else: 
    print(2)

# você pode adicionar elementos usando a função "add" dos sets
letters.add("e")

if "e" not in letters:
    print(1)
else: 
    print(2)

# da mesma forma, pode remover elementos usando a função "remove"
letters.remove("e")

if "e" not in letters:
    print(1)
else: 
    print(2)
