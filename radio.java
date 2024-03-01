import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class radio {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Pet Display App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Creating radio buttons for each pet
            JRadioButton birdButton = new JRadioButton("Bird");
            JRadioButton catButton = new JRadioButton("Cat");
            JRadioButton dogButton = new JRadioButton("Dog");
            JRadioButton rabbitButton = new JRadioButton("Rabbit");
            JRadioButton pigButton = new JRadioButton("Pig");

            // Grouping the radio buttons
            ButtonGroup petGroup = new ButtonGroup();
            petGroup.add(birdButton);
            petGroup.add(catButton);
            petGroup.add(dogButton);
            petGroup.add(rabbitButton);
            petGroup.add(pigButton);

            // Adding action listeners
            ActionListener listener = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String selectedPet = ((AbstractButton) e.getSource()).getText();
                    displayPetImage(selectedPet);
                }
            };
            birdButton.addActionListener(listener);
            catButton.addActionListener(listener);
            dogButton.addActionListener(listener);
            rabbitButton.addActionListener(listener);
            pigButton.addActionListener(listener);

            // Creating a label to display the pet image
            JLabel petLabel = new JLabel();
            frame.add(petLabel, BorderLayout.CENTER);

            // Adding radio buttons to the frame
            JPanel radioPanel = new JPanel();
            radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));
            radioPanel.add(birdButton);
            radioPanel.add(catButton);
            radioPanel.add(dogButton);
            radioPanel.add(rabbitButton);
            radioPanel.add(pigButton);
            frame.add(radioPanel, BorderLayout.WEST);

            frame.setVisible(true);
        });
    }

    private static void displayPetImage(String pet) {
        System.out.println("Displaying image for " + pet);
    }
}
