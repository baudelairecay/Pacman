package src;
import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args){
        // setting up the window
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // determines what will happen when the user hits close
                                                               // EXIT_ON_CLOSE: exits te application using the system exit method
        window.setResizable(false); // determines if the window is resizeable or not
        GamePanel game = new GamePanel();
        window.add(game); 
        window.pack();
        window.setLocationRelativeTo(null); // sets the location of the window in the center of the screen
        Image icon = new ImageIcon("Assets\\player\\1.png").getImage();
        window.setIconImage(icon); // sets the Icon image to the Image object
        window.setTitle("Pacman"); // gives the window a title name
        window.setVisible(true); // shows the window
        
    }
}