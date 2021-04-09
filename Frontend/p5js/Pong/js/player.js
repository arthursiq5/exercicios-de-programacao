class Player
{
    constructor()
    {
        this.width = 15;
        this.height = 80;

        this.position = createVector(this.width * 2, (height/2) - (this.height/2));
        this.acceleration = createVector(0, 0);
        this.speed = 10;
        this.maxSpeed = 10;

    }

    show()
    {
        noStroke();
        fill(255);
        rect(this.position.x,
            this.position.y,
            this.width,
            this.height
        );
    }

    up()
    {
        this.acceleration.y -= this.speed;
    }

    down()
    {
        this.acceleration.y += this.speed;
    }

    stop()
    {
        this.acceleration.y = 0;
    }

    update()
    {
        this.acceleration.y = constrain(this.acceleration.y, -this.maxSpeed, this.maxSpeed);
        this.position.add(this.acceleration);
        this.position.y = constrain(this.position.y, 0, height-this.height)
    }
}
