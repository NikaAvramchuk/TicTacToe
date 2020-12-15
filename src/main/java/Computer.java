import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

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
        Random random = new Random();
        return freeSquares.get(random.nextInt(freeSquares.size()-1));
    }

    @Override
    public Square chooseSquareIfEnemyIsClose() {
        Square[] seekingCombination = getWiningCombination();
        System.out.println(Arrays.toString(seekingCombination));
        System.out.println(Arrays.toString(potentialCombination));
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
                System.out.println(square);
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
