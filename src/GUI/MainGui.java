package GUI;

import javax.swing.*;
import java.awt.*;

public class MainGui {


    public static void main(String[] args) {
        // create a frame for the GUI
        JFrame frame = new JFrame("Ant Colony Simulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(new GridLayout(10, 10));
        frame.setVisible(true);



        // create a start button for the simulation
        JButton startButton = new JButton("Start");
        frame.add(startButton);
    }


}
