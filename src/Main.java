import javax.swing.*;
import java.awt.*;

public class Main {
    public static final int WINDOW_WIDTH = 1024;
    public static final int WINDOW_HEIGHT = 786;
    public static final String WINDOW_NAME = "RainerDB";

    public static final Color STEEL_BLUE = new Color (30, 27, 66);
    public static final Color MINT_GREEN = new Color (240, 255, 250);
    public static final Color BABY_PINK = new Color (255, 219, 227);
    public static final Color DARKER_GRAY = new Color (9, 9, 13);
    public static final String DEFAULT_FONT = "Bitstream Vera Sans Mono";

    public static void main(String[] args) {
        JFrame frame = WindowHandler.createWindow(DARKER_GRAY, WINDOW_WIDTH, WINDOW_HEIGHT, WINDOW_NAME);
        WindowHandler.createTitle(DEFAULT_FONT, 32, DARKER_GRAY, Color.WHITE, frame, WINDOW_NAME);
    }
}