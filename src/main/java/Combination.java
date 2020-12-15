public class Combination {
    static Square firstRowFirstColumn = new Square(1,1);
    static Square firstRowSecondColumn = new Square(1,2);
    static Square firstRowThirdColumn = new Square(1,3);
    static Square secondRowFirstColumn = new Square(2,1);
    static Square secondRowSecondColumn = new Square(2,2);
    static Square secondRowThirdColumn = new Square(2,3);
    static Square thirdRowFirstColumn = new Square(3,1);
    static Square thirdRowSecondColumn = new Square(3,2);
    static Square thirdRowThirdColumn = new Square(3,3);

    static Square[] firstRow = {firstRowFirstColumn,firstRowSecondColumn,firstRowThirdColumn};
    static Square[] secondRow = {secondRowFirstColumn,secondRowSecondColumn,secondRowThirdColumn};
    static Square[] thirdRow = {thirdRowFirstColumn,thirdRowSecondColumn,thirdRowThirdColumn};

    static Square[] firstColumn = {firstRowFirstColumn,secondRowFirstColumn,thirdRowFirstColumn};
    static Square[] secondColumn = {firstRowSecondColumn,secondRowSecondColumn,thirdRowSecondColumn};
    static Square[] thirdColumn = {firstRowThirdColumn,secondRowThirdColumn,thirdRowThirdColumn};

    static Square[] rightCross = {firstRowFirstColumn, secondRowSecondColumn, thirdRowThirdColumn};
    static Square[] leftCross = {thirdRowFirstColumn, secondRowSecondColumn, firstRowThirdColumn};




}