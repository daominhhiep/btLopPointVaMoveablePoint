package MovablePoint;

import Point.Point;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] array = new float[2];
        array[0] = this.xSpeed;
        array[1] = this.ySpeed;
        return array;
    }

    @Override
    public String toString() {
        return "(x,y) = "
                + "("
                + super.getX()
                + ","
                + super.getY()
                + ")"
                + "\n"
                + "speed = ("
                + this.xSpeed
                + ","
                + this.ySpeed
                + ")"
                +"\n";
    }

    public MovablePoint move(MovablePoint movablePoint) {
        movablePoint.setX(movablePoint.getX() + xSpeed);
        movablePoint.setY(movablePoint.getY() + ySpeed);
        return this;
    }
}
