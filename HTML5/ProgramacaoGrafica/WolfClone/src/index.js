import * as p5 from 'p5';
import { gamemap } from './Mapa';
import { gameHeight, gameWidth } from './constantes';

const containerElement = document.getElementById('p5-container');

let position;
let direction;

const sketch = (p) => {
    let x = 100;
    let y = 100;

    p.setup = function() {
        p.createCanvas(gameWidth, gameHeight);
        p.noStroke();
        position = p.createVector(5, 5);
        direction = p.createVector(0, -1);
    };

    p.draw = function() {
        p.background(190, 190, 255);
        p.fill(130);
        p.rect(0, gameHeight/2, gameWidth, gameHeight/2)
    };
};

new p5(sketch, containerElement);