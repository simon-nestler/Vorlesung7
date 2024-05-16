import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Klausur {

    public Klausur() {
        JFrame frame = new JFrame("Klausur");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Vorname");
        label.setBounds(50, 20, 200, 30);
        frame.add(label);

        frame.setVisible(true);
    }
}
