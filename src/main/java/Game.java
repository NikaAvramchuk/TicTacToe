import java.util.ArrayList;

public class Game {
    ArrayList<Square> allSquares = createAllSquares();
    ArrayList<Square> freeSquares = new ArrayList<>(allSquares);


    public ArrayList<Square> createAllSquares () {
        ArrayList<Square> allSquares = new ArrayList<>();
        Square firstRowFirstColumn = new Square(1,1);
        Square firstRowSecondColumn = new Square(1,2);
        Square firstRowThirdColumn = new Square(1,3);
        Square secondRowFirstColumn = new Square(2,1);
        Square secondRowSecondColumn = new Square(2,2);
        Square secondRowThirdColumn = new Square(2,3);
        Square thirdRowFirstColumn = new Square(3,1);
        Square thirdRowSecondColumn = new Square(3,2);
        Square thirdRowThirdColumn = new Square(3,3);
        allSquares.add(firstRowFirstColumn);
        allSquares.add(firstRowSecondColumn);
        allSquares.add(firstRowThirdColumn);
        allSquares.add(secondRowFirstColumn);
        allSquares.add(secondRowSecondColumn);
        allSquares.add(secondRowThirdColumn);
        allSquares.add(thirdRowFirstColumn);
        allSquares.add(thirdRowSecondColumn);
        allSquares.add(thirdRowThirdColumn);
        return allSquares;
    }


}
