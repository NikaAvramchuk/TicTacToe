import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Computer implements Action{
    Square[] potentialCombination = new Square[2];
    ArrayList<Square[]> handledPotentialCombination = new ArrayList<>();

    @Override
    public boolean checkEnemyMoves(ArrayList<Square> allEnemySquares) {
        if(allEnemySquares.size()==1)
            return false;

        for (int i = 0; i < allEnemySquares.size(); i++) {
            outerloop:
            for (int j = i + 1; j < allEnemySquares.size(); j++) {
                if (allEnemySquares.get(i).x == allEnemySquares.get(j).x
                        || allEnemySquares.get(i).y == allEnemySquares.get(j).y
                        || (allEnemySquares.get(i).x + allEnemySquares.get(j).x == allEnemySquares.get(i).y + allEnemySquares.get(j).y)) {

                    Square[] temporaryHold = {allEnemySquares.get(i), allEnemySquares.get(j)};
                    for (Square[] squares : handledPotentialCombination) {
                        if (squares[0].equals(temporaryHold[0]) && squares[1].equals(temporaryHold[1]) ) {
                            break outerloop;
                        }
                    }
                    potentialCombination[0] = allEnemySquares.get(i);
                    potentialCombination[1] = allEnemySquares.get(j);
                    handledPotentialCombination.add(potentialCombination);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Square chooseSquareIfThereIsNoRiskFromEnemy(ArrayList<Square> freeSquares) {
        Random random = new Random();
        return freeSquares.get(random.nextInt(freeSquares.size()-1));
    }

    @Override
    public Square chooseSquareIfEnemyIsClose(ArrayList<Square> freeSquares) {
        Square[] seekingCombination = getWiningCombination();
        Square squareFromCombinationList = getSquare(seekingCombination);
        Square squareFromFreeSquaresList = null;
        for(Square square1: freeSquares)
            if(square1.equals(squareFromCombinationList))
                squareFromFreeSquaresList=square1;
        return squareFromFreeSquaresList;
    }

    private Square getSquare(Square[] seekingCombination) {
        for(Square square: seekingCombination) {
            boolean flag = false;
            for (Square square1: potentialCombination){
                if(square1.equals(square)) {
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
        int matches=0;
        Square[] seekingCombination = new Square[3];
        for(Square[] squares: Combination.allCombinations) {
            for(Square square: squares)
                for(Square square1: potentialCombination) {
                    if(square.equals(square1)) {
                        matches++;
                        if(matches==2) {
                            return squares;
                        }
                    }
                }
            matches=0;
        }
        return seekingCombination;
    }

}
