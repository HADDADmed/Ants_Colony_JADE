package Models;

public class Ground {

    private Size size ;
    private Cell[][] grid;
    private Position nestPosition;
    private int antsCount;
    private int obstaclesCount;
    private int foodCount;

    public Ground(Size size, Cell[][] grid, Position nestPosition, int antsCount, int obstaclesCount, int foodCount) {
        this.size = size;
        this.grid = grid;
        this.nestPosition = nestPosition;
        this.antsCount = antsCount;
        this.obstaclesCount = obstaclesCount;
        this.foodCount = foodCount;
    }

    public Size getSize() {
        return size;
    }

    public Cell[][] getGrid() {
        return grid;
    }

    public Position getNestPosition() {
        return nestPosition;
    }

    public int getAntsCount() {
        return antsCount;
    }

    public int getObstaclesCount() {
        return obstaclesCount;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setGrid(Cell[][] grid) {
        this.grid = grid;
    }

    public void setNestPosition(Position nestPosition) {
        this.nestPosition = nestPosition;
    }

    public void setAntsCount(int antsCount) {
        this.antsCount = antsCount;
    }

    public void setObstaclesCount(int obstaclesCount) {
        this.obstaclesCount = obstaclesCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }




}
