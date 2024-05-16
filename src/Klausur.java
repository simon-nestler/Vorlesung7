import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Klausur {

    public Klausur() {
        JFrame frame = new JFrame("Klausur");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel content = new JPanel();
        LayoutManager layout = new GridLayout(5, 2, 5, 5);
        content.setLayout(layout);

        frame.setContentPane(content);

        JLabel label1 = new JLabel("Vorname");
        content.add(label1);

        JTextField textField1 = new JTextField();
        content.add(textField1);

        JLabel label2 = new JLabel("Nachname");
        content.add(label2);

        JTextField textField2 = new JTextField();
        content.add(textField2);

        JLabel label3 = new JLabel("Matrikelnummer");
        content.add(label3);

        JTextField textField3 = new JTextField();
        content.add(textField3);

        JLabel label4 = new JLabel("Note");
        content.add(label4);

        JTextField textField4 = new JTextField();
        content.add(textField4);

        JButton button1 = new JButton("Speichern");
        content.add(button1);

        JButton button2 = new JButton("Abbrechen");
        content.add(button2);

        frame.setVisible(true);
    }

    private Color colorChooser(JFrame frame) {
        return JColorChooser.showDialog(frame, "Farbauswahl", Color.RED);
    }

    private void modalDialog() {
        JDialog dialog = new JDialog();
        dialog.setTitle("Modaler Dialog");
        dialog.setSize(400, 300);
        dialog.setModal(true);
        dialog.add(new JLabel("Bitte speichern Sie zunächst Ihre Änderungen!"));
        dialog.setVisible(true);
    }

    private void methodenFuerKomponenten() {
        JLabel label = new JLabel("Vorname");

        // Ermittlung der Hintergrundfarbe der Komponente label
        Color hintergrundfarbe = label.getBackground();

        // Setzen der Hintergrundfarbe der Komponente label auf rot
        label.setBackground(Color.RED);

        // Setzen der Hintergrundfarbe auf blau
        Color blau = new Color(2, 2, 255);
        Color blau2 = new Color(0.01f, 0.1f, 1f);

        label.setBackground(blau);

        // Setzen der Vordergrundfarbe
        label.setForeground(Color.GREEN);

        // Auslesen der Vordergrundfarbe
        Color vordergrundfarbe = label.getForeground();

        // Auslesen der Font
        Font font = label.getFont();

        // Setzen der Schriftart
        Font arial20 = new Font("Arial", Font.BOLD | Font.ITALIC, 20);
        label.setFont(arial20);

        // Auslesen der Höhe
        int hoehe = label.getHeight();

        // Auslesen der Breite
        int breite = label.getWidth();
    }
}
