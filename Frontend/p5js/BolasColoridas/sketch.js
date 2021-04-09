const HEIGHT = 800;
const WIDTH = 800;
const SPEED = 10;
const QUANTIDADE = 500;
let currentColor = 0;
const COLORS = [
    '#f44336',
    '#e91e63',
    '#9c27b0',
    '#673ab7',
    '#3f51b5',
    '#2196f3',
    '#03a9f4',
    '#00bcd4',
    '#009688',
    '#4caf50',
    '#ff9800',
    '#ff5722'
];

class Bola {
    constructor(x, y, color){
        this.x = x;
        this.y = y;
        this.raio = 20;
        this.directionX = SPEED;
        this.directionY = SPEED;
        this.color = color;
    }

    _correctPosition(){
        this.x += this.directionX;
        this.y += this.directionY;

        if (this.x <= 1) {
            this.directionX = -this.directionX;
            this.x = 2;
            this.y += random(0, 2);
        }
        if (this.x >= WIDTH) {
            this.directionX = -this.directionX;
            this.x = WIDTH - 1;
            this.y += random(0, 2);
        }
        if (this.y <= 1) {
            this.directionY = -this.directionY;
            this.y = 2
            this.x += random(0, 450) * random();
        } 
        if (this.y >= WIDTH) {
            this.directionY = -this.directionY;
            this.y = WIDTH - 1;
            this.x += random(0, 450) * random();
        }
    }

    draw(){
        this._correctPosition();

        noStroke();
        fill(this.color);
        circle(this.x, this.y, this.raio);
    }
}

const geraBolas = () => Array(QUANTIDADE).fill().map((element, index) => {
    if (currentColor == COLORS.length)
        currentColor = 0;
    return new Bola(index, QUANTIDADE - index, COLORS[currentColor++]);
})

let bolas = geraBolas();

function setup() {
    createCanvas(WIDTH, HEIGHT); // cria um canvas de 400px por 400px
}

function draw() {
    background(220); // define a cor de fundo do canvas
    bolas.forEach(bola => bola.draw());
}