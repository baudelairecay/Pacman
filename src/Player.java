package src;
import java.awt.*;
import javax.swing.*;

public class Player {
    int pos_X;
    int pos_Y;
    int health;
    Image[] playerImages = new Image[4];
    public Player(){
        pos_X = 0;
        pos_Y = 0;
        health = 100;
        playerImages[0] = setPlayerImage("Assets\\player\\1.png");
        playerImages[1] = setPlayerImage("Assets\\player\\2.png");
        playerImages[2] = setPlayerImage("Assets\\player\\3.png");
        playerImages[3] = setPlayerImage("Assets\\player\\4.png");
    }
    private Image setPlayerImage(String filename){
        Image result = new ImageIcon(filename).getImage();
        if(result == null){
            System.out.println("failed to load " + filename);
        }
        return result;
    }
    
}