package Models;
// create a class Food for the food object in the ants simulation
public class Food {
    private Position position;
    private final int quantity;

    // constructor for the Food class
    public Food(Position position, int quantity) {
        this.position = position;
        this.quantity = quantity;
    }

    // getter for the position of the food
    public Position getPosition() {
        return position;
    }

    // getter for the quantity of the food
    public int getQuantity() {
        return quantity;
    }

    // setter for the position of the food
    public void setPosition(Position position) {
        this.position = position;
    }

}
