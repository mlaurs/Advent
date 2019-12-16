package Tag3;

import java.util.ArrayList;

public class Streckenbestimmen {

    private Position aktuel;


    public Streckenbestimmen(int x, int y) {
        aktuel = new Position(x, y);
    }

    public ArrayList<Position> allePunkte(String s) {
        ArrayList<Position> pos = new ArrayList<>();
        String[] richtungsangaben = s.split(",");

        for (String g : richtungsangaben) {

            if (g.charAt(0) == 'R') {
                g = g.substring(1);

                for (int i = 0; i < Integer.parseInt(g); i++) {
                    pos.add(new Position(aktuel.getX() + i, aktuel.getY()));
                }
                aktuel = new Position(aktuel.getX() + Integer.parseInt(g), aktuel.getY());
            }

            if (g.charAt(0) == 'L') {

                g = g.substring(1);

                for (int i = 0; i < Integer.parseInt(g); i++) {
                    pos.add(new Position(aktuel.getX() - i, aktuel.getY()));
                }
                aktuel = new Position(aktuel.getX() - Integer.parseInt(g), aktuel.getY());
            }


            if (g.charAt(0) == 'D') {


                g = g.substring(1);

                for (int i = 0; i < Integer.parseInt(g); i++) {
                    pos.add(new Position(aktuel.getX(), aktuel.getY() - i));
                }
                aktuel = new Position(aktuel.getX(), aktuel.getY() - Integer.parseInt(g));
            }


            if (g.charAt(0) == 'U') {
                g = g.substring(1);


                for (int i = 0; i < Integer.parseInt(g); i++) {

                    pos.add((new Position(aktuel.getX(), aktuel.getY() + i)));

                }
                aktuel = new Position(aktuel.getX(), aktuel.getY() + Integer.parseInt(g));
            }

        }
        Position a = new Position(0, 0);
        pos.remove(a);
        return pos;
    }

}
