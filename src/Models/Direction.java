package Models;
//creating a direction class for the ant to move in

public class Direction {
    private Position position;

    public Direction(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }

}
