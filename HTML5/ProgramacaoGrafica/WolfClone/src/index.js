import * as p5 from 'p5';
import { gamemap } from './Mapa';
import { gameHeight, gameWidth } from './constantes';

const containerElement = document.getElementById('p5-container');

const sketch = (p) => {
    let x = 100;
    let y = 100;

    p.setup = function() {
        p.createCanvas(gameWidth, gameHeight);
        p.noStroke();
    };

    p.draw = function() {
        p.background(190, 190, 255);
        p.fill(130);
        p.rect(0, gameHeight/2, gameWidth, gameHeight/2)
    };
};

new p5(sketch, containerElement);