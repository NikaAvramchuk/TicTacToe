import javax.swing.*;
import java.util.Objects;

public class Square extends JButton {
    final int x;
    final int y;
    final boolean rightCross;
    final boolean leftCross;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
        if((x == 2 && y == 2)) {
            rightCross=true;
            leftCross=true;
        }
        else if((x == 1 && y == 1) || (x == 3 && y == 3)) {
            rightCross=true;
            leftCross=false;
        }
        else if((x == 1 && y == 3) || (x == 3 && y == 1)) {
            rightCross=false;
            leftCross=true;
        }
        else {
            rightCross=false;
            leftCross=false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return x == square.x &&
                y == square.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y;
    }
}
