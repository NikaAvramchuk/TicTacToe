import java.util.ArrayList;

public interface Action {
    boolean checkEnemyMoves(ArrayList<Square> allEnemySquares);
    Square chooseSquare(ArrayList<Square> freeSquares);

}
