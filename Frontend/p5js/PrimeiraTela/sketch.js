let x = 100;
function setup() {
    createCanvas(400, 400); // cria um canvas de 400px por 400px
}

function draw() {
    background(220); // define a cor de fundo do canvas
    circle(x, 200, 30);
    x++;
}