package HelloGUI;
import javax.swing.*;

public class HelloGUI {
    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame("Ini percobaan HelloGUI Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Program will stop running when the frame is closed
        frame.setSize(600, 300); //x, y size of interface on windows
        frame.setLocation(200,200); //x, y location of interface
        frame.setLocationRelativeTo(null); //To place in the center of the screen
        frame.setVisible(true); //To make the frame visible
    }
}
