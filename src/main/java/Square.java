import javax.swing.*;

public class Square extends JButton {
    final int x;
    final int y;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private static class Combination {
        Square firstRowFirstColumn = new Square(1,1);
        Square firstRowSecondColumn = new Square(1,2);
        Square firstRowThirdColumn = new Square(1,3);
        Square secondRowFirstColumn = new Square(2,1);
        Square secondRowSecondColumn = new Square(2,2);
        Square secondRowThirdColumn = new Square(2,3);
        Square thirdRowFirstColumn = new Square(3,1);
        Square thirdRowSecondColumn = new Square(3,2);
        Square thirdRowThirdColumn = new Square(3,3);

        Square[] firstRow = {firstRowFirstColumn,firstRowSecondColumn,firstRowThirdColumn};
        Square[] secondRow = {secondRowFirstColumn,secondRowSecondColumn,secondRowThirdColumn};
        Square[] thirdRow = {thirdRowFirstColumn,thirdRowSecondColumn,thirdRowThirdColumn};

        Square[] firstColumn = {firstRowFirstColumn,secondRowFirstColumn,thirdRowFirstColumn};
        Square[] secondColumn = {firstRowSecondColumn,secondRowSecondColumn,thirdRowSecondColumn};
        Square[] thirdColumn = {firstRowThirdColumn,secondRowThirdColumn,thirdRowThirdColumn};

        Square[] rightCross = {firstRowFirstColumn, secondRowSecondColumn, thirdRowThirdColumn};
        Square[] leftCross = {thirdRowFirstColumn, secondRowSecondColumn, firstRowThirdColumn};


    }

}
