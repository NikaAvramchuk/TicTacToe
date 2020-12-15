import java.util.ArrayList;

public class Computer implements Action{
    @Override
    public boolean checkEnemyMoves(ArrayList<Square> allEnemySquares) {

        return false;
    }

    @Override
    public Square chooseSquare(ArrayList<Square> freeSquares) {
        return null;
    }
}
