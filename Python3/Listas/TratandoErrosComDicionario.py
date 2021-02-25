pairs = {1: "apple",
    "orange": [2, 3, 4], 
    True: False, 
    12: "True",
}

print(pairs.get("orange")) # escreve [2, 3, 4]
print(pairs.get("oransge")) # escreve none
print(pairs.get(7, 42)) # escreve 42
print(pairs.get(12345, "not found")) # escreve not found
