package MyInputForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyInputForm extends JFrame {
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    
    private JLabel aLabel, bLabel, cLabel;
    private JTextField aField, bField;
    private JButton button, addButton;
    private JPanel panel;

    public MyInputForm() {
        createTextField();
        createButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_WIDTH);
    }

    private void createTextField() {
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai C: ");
        cLabel = new JLabel("Hasil: ");

        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }

    private void createButton() {
        // Multiplication
        button = new JButton("Multiply");
        class MultiplyListener implements ActionListener {
            // Untuk event klik
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a*b;
                cLabel.setText("Hasil: " + c);
            }
        }
        ActionListener listener = new MultiplyListener();
        button.addActionListener(listener);

        // Addition
        addButton = new JButton("Add");
        class AddListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Untuk event klik
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a+b;
                cLabel.setText("Hasil: " + c);
            }
        }
        listener = new AddListener();
        addButton.addActionListener(listener);
    }

    private void createPanel() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(addButton);
        panel.add(cLabel);
        add(panel);
    }
}
