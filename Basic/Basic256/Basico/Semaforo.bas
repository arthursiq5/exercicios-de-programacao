# mostra uma luz de tráfico e diz uma mensagem

clg # limpa os gráficos da tela

color black # seleciona a cor preta para desenhar
# os primeiros dois números mostram as coordenadas do retângulo (x, y)
# os dois últimos mostram as medidas (x, y)
rect 100, 50, 100, 200

color darkred # seleciona a cor vermelho escuro
# os primeiros dois números mostram as coordenadas do círculo (x, y)
# o último mostra a medida (raio)
circle 150, 100, 20

color darkyellow # seleciona o amarelo escuro
circle 150,150,20

color green # seleciona o verde escuro
circle 150,200,20

say "Green light. You may go."
