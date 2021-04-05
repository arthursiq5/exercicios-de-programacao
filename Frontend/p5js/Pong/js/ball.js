class Ball
{
    constructor()
    {
        this.position = createVector(width/2, height/2);
        this.radius = 10;
        this.maxSpeed = createVector(20, 15);

        do{
            this.acceleration = p5.Vector.random2D()
            this.acceleration.setMag(random(4, 6));
        }while(abs(this.acceleration.x) < 3 || abs(this.acceleration.y) < 3);
    }

    show()
    {
        noStroke();
        fill(255);
        ellipse(this.position.x, this.position.y, this.radius * 2);
    }

    update()
    {
        this.position.add(this.acceleration);

        if (this.position.y < this.radius || this.position.y > height - this.radius){
            this.acceleration.y *= -1;
        }
    }
}
