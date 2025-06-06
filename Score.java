import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Score {
    
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;

    Score(int GAME_HEIGHT, int GAME_WIDTH) {
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;

    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        //g.setFont(Font.BOLD));

        g.drawLine(GAME_WIDTH/2, 0,GAME_WIDTH/2, GAME_HEIGHT);

        g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10), (GAME_WIDTH/2)-85, 50);
        g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10), (GAME_WIDTH/2)+20, 50);

    }

}
