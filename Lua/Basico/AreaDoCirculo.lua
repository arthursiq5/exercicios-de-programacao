pi = 3.14159

print("Digite o raio do círculo: ")
raio = tonumber(io.read())

area = pi * raio^2

print("A=" .. string.format("%.4f", area))
