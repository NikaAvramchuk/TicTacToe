import java.util.ArrayList;
import java.util.Arrays;

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
    public Square chooseSquareIfEnemyIsClose() {
        Square[] seekingCombination = getWiningCombination();
        return getSquare(seekingCombination);
    }

    private Square getSquare(Square[] seekingCombination) {
        for(Square square: seekingCombination) {
            boolean flag = false;
            for (Square square1: potentialCombination){
                if(square.equals(square1)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                 return square;
            }
        }
        return null;
    }

    private Square[] getWiningCombination() {
        Square[] seekingCombination = new Square[3];
        for(int i=0; i<Combination.allCombinations.length; i++) {
            if(Arrays.asList(Combination.allCombinations[i]).containsAll(Arrays.asList(potentialCombination)))
                seekingCombination=Combination.allCombinations[i];
        }
        return seekingCombination;
    }

}
