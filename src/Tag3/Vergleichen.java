package Tag3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Vergleichen {


    public static int vergleiche(ArrayList<Position> kabel1, ArrayList<Position> kabel2) {
        ArrayList<Position> alleGemeinsamenPunkte = new ArrayList<>();
        int distanz = Integer.MAX_VALUE;
        int counter = Integer.MAX_VALUE;

        HashSet<Position> a = new HashSet<>(kabel2);
//        for (int i = 0; i < kabel1.size(); i++) {
//            for (int j = 0; j < kabel2.size(); j++) {
//                if(kabel1.get(i).equals(kabel2.get(j))){
//                    if(counter > (i +1) + (j+1)){
//                        counter = (i+1) + (j+1);
//                    }
//                }
//            }
//        }
        for (Position e : kabel1) {
//            for (Position r : kabel2) {
//
//                if (e.getY() == r.getY() && e.getX() == r.getX()) {
//                }
//            }
            if (a.contains(e)) {
                alleGemeinsamenPunkte.add(e);
            }
        }

        for (Position c : alleGemeinsamenPunkte) {

//            if (Math.abs(ursprungsdistanzdistanz(c)) < distanz) {
//                distanz = Math.abs(ursprungsdistanzdistanz(c));
//            }
            if (counter > kabel1.indexOf(c) + 1 + kabel2.indexOf(c) + 1) {
                counter = kabel1.indexOf(c) + 1 + kabel2.indexOf(c) + 1;
            }
        }
        return counter;

    }


    private static int ursprungsdistanzdistanz(Position x) {

        return Math.abs(x.getX()) + Math.abs(x.getY());

    }


}
