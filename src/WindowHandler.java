import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class WindowHandler {
    public static void createTitle(String font, int fontSize, Color backgroundColor, Color foregroundColor, JFrame frame, String labelText) {
        JLabel label = new JLabel(labelText);
        label.setFont(new Font(font, Font.PLAIN, fontSize));
        label.setBorder(new EmptyBorder(10, frame.getWidth(), 10, frame.getWidth()));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.NORTH);
        label.setBackground(backgroundColor);
        label.setOpaque(true);
        label.setForeground(foregroundColor);
        frame.add(label);
    }

    public static JFrame createWindow(Color backgroundColor, int windowWidth, int windowHeight, String windowName) {
        JFrame frame = new JFrame(windowName);
        frame.getContentPane().setBackground(backgroundColor);
        frame.setSize(windowWidth, windowHeight);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        return frame;
    }
}
