package Models;

public class Obstacle {
    private Position position;
    private int size;

    public Obstacle(Position position, int size) {
        this.position = position;
        this.size = size;
    }

    public Position getPosition() {
        return position;
    }

    public int getSize() {
        return size;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
