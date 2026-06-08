package src;
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel{
    final int screenWidth = 800;
    final int screenHeight = 600;
    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground((Color.black));
        this.setDoubleBuffered(true);
    }
}