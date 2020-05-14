package edu.ufp.inf.lp2.Intro;

public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float distanceX(Point p) {
        return p.x - this.x;
    }

    public float distanceY(Point p) {
        return p.y - this.y;
    }

    public float distance(Point p) {
        float dx = this.distanceX(p);
        float dy = this.distanceY(p); // = p.distanceY(this);

        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    public void moveX(float dx) {
        this.x += dx;
    }

    public void moveY(float dy) {
        this.y += dy;
    }

    public void move(float dx, float dy) {
        this.moveX(dx);
        this.moveY(dy);
    }
}
