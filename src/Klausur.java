import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;

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

        JPanel contentAussen = new JPanel();
        JPanel contentInnen = new JPanel();
        LayoutManager layout = new FlowLayout(FlowLayout.CENTER, 0, 0);
        LayoutManager aussen = new BorderLayout(5, 5);
        LayoutManager innen = new BorderLayout(5, 5);

        contentAussen.setLayout(aussen);
        contentInnen.setLayout(innen);

        frame.setContentPane(contentAussen);
        contentAussen.add(contentInnen, BorderLayout.CENTER);

        JButton label1 = new JButton("Vorname");
        contentInnen.add(label1, BorderLayout.NORTH);

        JButton label2 = new JButton("Nachname");
        contentInnen.add(label2, BorderLayout.SOUTH);

        JButton label3 = new JButton("Matrikelnummer");
        contentAussen.add(label3, BorderLayout.WEST);

        JButton label4 = new JButton("Note");
        contentInnen.add(label4, BorderLayout.CENTER);

        JButton label5 = new JButton("Bestanden");
        contentAussen.add(label5, BorderLayout.EAST);

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
