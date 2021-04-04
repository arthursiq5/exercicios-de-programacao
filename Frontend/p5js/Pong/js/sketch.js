var dots = [];
const dSize = 10;

function setup() {
    createCanvas(800, 500);

    for (let y = dSize / 2; y < height; y += dSize * 2) {
        dots.push(createVector((width / 2) - (dSize / 2), y));
    }
}

function draw() {
    background(0);

    noStroke();
    fill(255);
    drawSquares();
}

function drawSquares(){
    let dotsLength = dots.length;
    for(let i = 0; i < dotsLength; i++){
        let x = dots[i].x;
        let y = dots[i].y;

        rect(x, y, dSize, dSize);
    }
}