package ManagementLayout;

// Import utilities
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border extends JFrame{
    private static final int FRAME_WIDTH = 600, 
                                FRAME_HEIGHT = 200;
    private JPanel panel;

    // Membuat konstriktor BorderLayoutForm
    public Border() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        panel.add(new JButton("1"), BorderLayout.NORTH);
        panel.add(new JButton("4"), BorderLayout.WEST);
        panel.add(new JButton("5"), BorderLayout.CENTER);
        panel.add(new JButton("3"), BorderLayout.EAST);
        panel.add(new JButton("2"), BorderLayout.SOUTH);

        add(panel);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Border Layout Demo");
    }


}
