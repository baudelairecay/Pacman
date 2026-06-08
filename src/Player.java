package src;
import java.awt.*;

public class Player extends GamePanel {
    int pos_X;
    int pos_Y;
    int health;
    Image[] playerImages = new Image[4];
    public Player(){
        pos_X = (int)(screenWidth / 2);
        pos_Y = (int)(screenHeight / 2);
        health = 100;
    }
    
    
}
