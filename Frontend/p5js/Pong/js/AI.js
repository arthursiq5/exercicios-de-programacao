class AI
{
    constructor(ball)
    {
        this._ball = ball;
        this.width = 15;
        this.height = 80;

        this.position = createVector(width - this.width*2, height/2 - this.height/2);
        this.acceleration = createVector(0, 0);
        this.speed = 10;
        this.maxSpeed = 10;
    }

    show()
    {
        noStroke();
        fill(255);
        rect(this.position.x, this.position.y, this.width, this.height);
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
        let d1 = dist(this._ball.position.x, this._ball.position.y, this.position.x, this.position.y);
        let d2 = dist(this._ball.position.x, this._ball.position.y, this.position.x, this.position.y + this.height);

        let d = (d1 + d2) / 2;

        this.position.add(this.acceleration);
        this.position.y = constrain(this.position.y, 0, height-this.height);

        if (d < 450) {
            if ( this._ball.position.y < this.position.y - this.height / 2) {
                this.acceleration.y -= this.speed;
            }else{
                this.acceleration.y += this.speed;
            }
            this.acceleration.y = constrain(this.acceleration.y, -this.maxSpeed, this.maxSpeed);
        }else{
            this.acceleration.y += random(-this.speed * 0.9, this.speed);
            this.acceleration.y = constrain(this.acceleration.y, -this.maxSpeed, this.maxSpeed);
        }
    }
}
