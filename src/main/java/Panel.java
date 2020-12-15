import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Panel extends JPanel {
    Game game = new Game();
    Color pink = Color.PINK;
    Computer computer = new Computer();

    public Panel() {
        setLayout(null);
        setBackground(pink);
        locateAllSquaresOnBoard(game.allSquares);
    }

    public void locateAllSquaresOnBoard(ArrayList<Square> allSquares) {
        int horizontal;
        int vertical;

        for(Square square: allSquares) {
            horizontal=30+(SquareSize.WIDTH.value*square.y);
            vertical=30+(SquareSize.HEIGHT.value*square.x);
            square.setBounds(horizontal,vertical,SquareSize.WIDTH.value,SquareSize.HEIGHT.value);
            setSquaresBoards(square);
            addActionListener(square);
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

    public void addActionListener (Square square) {
        square.addActionListener(e -> {
            square.setBackground(Color.WHITE);
            game.freeSquares.remove(square);
            game.userBookedSquares.add(square);
//            for (Square[] squares : Combination.allCombinations) {
//                if (game.userBookedSquares.containsAll(Arrays.asList(squares)))
//                    game.gameOver = true;
//            }
            Square computerSquare;
            if (computer.checkEnemyMoves(game.userBookedSquares)) {
                computerSquare = computer.chooseSquareIfEnemyIsClose(game.freeSquares);

            } else {
                computerSquare = computer.chooseSquareIfThereIsNoRiskFromEnemy(game.freeSquares);
            }
            computerSquare.setBackground(Color.BLACK);
            game.freeSquares.remove(computerSquare);

        });
    }
 }

