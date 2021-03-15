import * as p5 from 'p5';
import { gamemap } from './Mapa';

const containerElement = document.getElementById('p5-container');

const sketch = (p) => {
    let x = 100;
    let y = 100;

    p.setup = function() {
        p.createCanvas(800, 800);
    };

    p.draw = function() {
        p.background(255);
    };
};

new p5(sketch, containerElement);