package Models;
//creat a cell class for the Ground  that will be used to create the grid for the ant colony simulation the ant will dffuse the pheronome on the cell
public class Cell {
    private Position position;
    private double pheromone;
    private boolean isObstacle;
    private boolean isFood;
    private boolean isNest;
    private boolean isAnt;

    //constructor for the cell class
    public Cell(Position position, double pheromone, boolean isObstacle, boolean isFood, boolean isNest, boolean isAnt) {
        this.position = position;
        this.pheromone = pheromone;
        this.isObstacle = isObstacle;
        this.isFood = isFood;
        this.isNest = isNest;
        this.isAnt = isAnt;
    }

    //getter for the position of the cell
    public Position getPosition() {
        return position;
    }

    //getter for the pheromone of the cell
    public double getPheromone() {
        return pheromone;
    }

    //getter for the isObstacle of the cell
    public boolean isObstacle() {
        return isObstacle;
    }

    //getter for the isFood of the cell
    public boolean isFood() {
        return isFood;
    }

    //getter for the isNest of the cell
    public boolean isNest() {
        return isNest;
    }

    //getter for the isAnt of the cell
    public boolean isAnt() {
        return isAnt;
    }

    //setter for the position of the cell
    public void setPosition(Position position) {
        this.position = position;
    }

    //setter for the pheromone of the cell
    public void setPheromone(double pheromone) {
        this.pheromone = pheromone;
    }

    //setter for the isObstacle of the cell
    public void setObstacle(boolean obstacle) {
        isObstacle = obstacle;
    }

    //setter for the isFood of the cell
    public void setFood(boolean food) {
        isFood = food;
    }

    //setter for the isNest of the cell
    public void setNest(boolean nest) {
        isNest = nest;
    }

    //setter for the isAnt of the cell
    public void setAnt(boolean ant) {
        isAnt = ant;
    }

}
