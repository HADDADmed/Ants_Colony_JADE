package Models;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position(Position position) {
        this.x = position.getX();
        this.y = position.getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setPosition(Position position) {
        this.x = position.getX();
        this.y = position.getY();
    }

    public boolean equals(Position position) {
        return this.x == position.getX() && this.y == position.getY();
    }

    public Position add(Position position) {
        return new Position(this.x + position.getX(), this.y + position.getY());
    }

    public Position subtract(Position position) {
        return new Position(this.x - position.getX(), this.y - position.getY());
    }

    public Position multiply(int value) {
        return new Position(this.x * value, this.y * value);
    }

    public Position divide(int value) {
        return new Position(this.x / value, this.y / value);
    }

    public Position getDirection(Position position) {
        return new Position(position.getX() - this.x, position.getY() - this.y);
    }

    public int getDistance(Position position) {
        return Math.abs(this.x - position.getX()) + Math.abs(this.y - position.getY());
    }

    public int getManhattanDistance(Position position) {
        return Math.abs(this.x - position.getX()) + Math.abs(this.y - position.getY());
    }

    public int getEuclideanDistance(Position position) {
        return (int) Math.sqrt(Math.pow(this.x - position.getX(), 2) + Math.pow(this.y - position.getY(), 2));
    }

    public Position getNormalizedDirection(Position position) {
        Position direction = getDirection(position);
        if (direction.getX() != 0) {
            direction.setX(direction.getX() / Math.abs(direction.getX()));
        }
        if (direction.getY() != 0) {
            direction.setY(direction.getY() / Math.abs(direction.getY()));
        }
        return direction;
    }

}

