package Agent;
// creating an agent that will be used to implement the Ant Colony Optimization algorithm's logic
public class AntAgent {
    // the agent will have a position, a path, and a cost
    private int position;
    private int[] path;
    private double cost;
    // the agent will have a constructor that will initialize the position, path, and cost
    public AntAgent(int position, int[] path, double cost) {
        this.position = position;
        this.path = path;
        this.cost = cost;
    }
    // the agent will have a method that will return the position
    public int getPosition() {
        return position;
    }
    // the agent will have a method that will set the position
    public void setPosition(int position) {
        this.position = position;
    }
    // the agent will have a method that will return the path
    public int[] getPath() {
        return path;
    }
    // the agent will have a method that will set the path
    public void setPath(int[] path) {
        this.path = path;
    }
    // the agent will have a method that will return the cost
    public double getCost() {
        return cost;
    }
    // the agent will have a method that will set the cost
    public void setCost(double cost) {
        this.cost = cost;
    }
    // the agent will have a method that will return the string representation of the agent
    @Override
    public String toString() {
        return "AntAgent{" +
                "position=" + position +
                ", path=" + java.util.Arrays.toString(path) +
                ", cost=" + cost +
                '}';
    }

}
