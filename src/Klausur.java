import java.awt.Color;
import java.awt.Font;

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
        frame.setContentPane(content);

        JButton label1 = new JButton("Vorname");
        content.add(label1);

        JButton label2 = new JButton("Nachname");
        content.add(label2);

        JButton label3 = new JButton("Matrikelnummer");
        content.add(label3);

        JButton label4 = new JButton("Note");
        content.add(label4);

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
