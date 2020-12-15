import javax.swing.*;
import java.util.Objects;

public class Square extends JButton {
    final int x;
    final int y;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
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
}
