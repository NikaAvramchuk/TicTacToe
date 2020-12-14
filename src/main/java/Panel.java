import javax.swing.*;
import java.util.ArrayList;

public class Panel extends JPanel {
    Game game = new Game();
    public Panel() {
        setLayout(null);
        locateAllSquaresonBoard(game.allSquares);
    }

    public void locateAllSquaresonBoard (ArrayList<Square> allSquares) {
        int horizontal;
        int vertical;

        for(Square square: allSquares) {
            horizontal=30+(SquareSize.WIDTH.value*square.x);
            vertical=30+(SquareSize.HEIGHT.value*square.y);
            square.setBounds(horizontal,vertical,SquareSize.WIDTH.value,SquareSize.HEIGHT.value);
            add(square);
        }

    }

}
