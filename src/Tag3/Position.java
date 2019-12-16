package Tag3;

import java.util.Arrays;

public class Position {
    int[] XY = new int[2];


    public Position(int x, int y) {
        XY[0] = x;
        XY[1] = y;
    }

    public int getY() {
        return XY[1];
    }

    public int getX() {
        return XY[0];
    }

    public String toString() {

        return XY[0] + " / " + XY[1];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return Arrays.equals(XY, position.XY);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(XY);
    }
}
