var player, ball;
var dots = [];
const dSize = 10;

function setup() {
    createCanvas(800, 500);

    player = new Player();
    ball = new Ball();

    for (let y = dSize / 2; y < height; y += dSize * 2) {
        dots.push(createVector((width / 2) - (dSize / 2), y));
    }
}

function draw() {
    background(0);

    noStroke();
    fill(255, 100);
    drawSquares();

    player.update();
    player.show();

    ball.update();
    ball.show();
}

function drawSquares(){
    let dotsLength = dots.length;
    for(let i = 0; i < dotsLength; i++){
        let x = dots[i].x;
        let y = dots[i].y;

        rect(x, y, dSize, dSize);
    }
}

function keyPressed() {
    if (key == "W" || keyCode  == UP_ARROW){
        player.up();
        return;
    }

    if (key == "S" || keyCode  == DOWN_ARROW){
        player.down();
        return;
    }
}

function keyReleased(){
    if (key == "W" || keyCode  == UP_ARROW || key == "S" || keyCode  == DOWN_ARROW){
        player.stop();
    }
}