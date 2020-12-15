import java.util.ArrayList;

public class Computer implements Action{
    Square[] potentialCombination = new Square[2];

    @Override
    public boolean checkEnemyMoves(ArrayList<Square> allEnemySquares) {
        for (Square square: allEnemySquares) {
            for (Square square1: allEnemySquares) {
                if(square.x==square1.x && square.y==square1.y)
                    continue;
                if (square.x==square1.x || square.y==square1.y|| (square.x+square1.x==square.y+square1.y)) {
                    potentialCombination[0]=square;
                    potentialCombination[1] = square1;
                    return true;
                }

            }
        }
        return false;
    }

    @Override
    public Square chooseSquareIfThereIsNoRiskFromEnemy(ArrayList<Square> freeSquares) {
        return null;
    }

    @Override
    public Square chooseSquareIfEnemyIsClose(ArrayList<Square> freeSquares) {
        return null;
    }
}
