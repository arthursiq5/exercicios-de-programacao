var player, ball, ai;

var playerScore = 0;
var IAScore = 0;

var dots = [];
const dSize = 10;
const txtSize = 30;

function setup()
{
    createCanvas(800, 500);

    player = new Player();
    ball = new Ball();
    ai = new AI(ball);

    for (let y = dSize / 2; y < height; y += dSize * 2) {
        dots.push(createVector((width / 2) - (dSize / 2), y));
    }
}

function draw()
{
    background(0);

    noStroke();
    fill(255, 100);
    drawSquares();
    drawScores();

    player.update();
    player.show();

    ball.update();
    ball.show();

    ai.update();
    ai.show();
}

function drawScores()
{
    let x1 = width * (1/4);
    let x2 = width * (3/4);
    let y = txtSize * 1.5;

    noStroke();
    fill(255);
    textAlign(CENTER);
    textSize(txtSize);
    text(playerScore, x1, y);
    text(IAScore, x2, y);
}

function drawSquares()
{
    let dotsLength = dots.length;
    for(let i = 0; i < dotsLength; i++){
        let x = dots[i].x;
        let y = dots[i].y;

        rect(x, y, dSize, dSize);
    }
}

function keyPressed()
{
    if (key == "W" || keyCode  == UP_ARROW){
        player.up();
        return;
    }

    if (key == "S" || keyCode  == DOWN_ARROW){
        player.down();
        return;
    }
}

function keyReleased()
{
    if (key == "W" || keyCode  == UP_ARROW || key == "S" || keyCode  == DOWN_ARROW){
        player.stop();
    }
}
