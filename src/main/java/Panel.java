import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Panel extends JPanel {
    Game game = new Game();
    Color pink = Color.PINK;
    public Panel() {
        setLayout(null);
        setBackground(pink);
        locateAllSquaresonBoard(game.allSquares);
    }

    public void locateAllSquaresonBoard (ArrayList<Square> allSquares) {
        int horizontal;
        int vertical;

        for(Square square: allSquares) {
            horizontal=30+(SquareSize.WIDTH.value*square.y);
            vertical=30+(SquareSize.HEIGHT.value*square.x);
            square.setBounds(horizontal,vertical,SquareSize.WIDTH.value,SquareSize.HEIGHT.value);
            setSquaresBoards(square);
            square.addActionListener(e -> System.out.println(square.x + " " +square.y));
            add(square);
        }

    }

    public void setSquaresBoards (Square square) {
        square.setBorder(BorderFactory.createMatteBorder(0,0,6,6,Color.BLACK));
        if(square.x==3)
            square.setBorder(BorderFactory.createMatteBorder(0,0,0,6,Color.BLACK));
        if(square.y==3)
            square.setBorder(BorderFactory.createMatteBorder(0,0,6,0,Color.BLACK));
        if(square.x==3 && square.y==3)
            square.setBorder(BorderFactory.createEmptyBorder());
        square.setBackground(pink);

    }

}
