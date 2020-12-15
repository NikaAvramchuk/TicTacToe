import java.util.ArrayList;

public interface Action {
    boolean checkEnemyMoves(ArrayList<Square> allEnemySquares);
    Square chooseSquareIfThereIsNoRiskFromEnemy(ArrayList<Square> freeSquares);
    Square chooseSquareIfEnemyIsClose();



}
