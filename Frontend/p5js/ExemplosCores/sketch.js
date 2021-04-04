let x = 100;
function setup() {
    createCanvas(400, 400);
}

function draw() {
    background(220);

    strokeWeight(1); // borda de expessura padrão
    stroke(0); // pinta a borda de preto
    noFill(); // remove a cor de preenchimento
    square(30, 30, 50);

    strokeWeight(10); // aumenta a grossura da borda
    stroke(0, 255, 0); // pinta a borda de verde
    fill(255, 0, 0); // pinta o desenho a seguir de vermelho
    circle(200, 200, 200);
}