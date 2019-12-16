package Tag1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SpritVomSprit {

    public static void main(String[] args) {
        ArrayList<Integer> masse = new ArrayList<>();
        int sprit = 0;
        ArrayList<Integer> Spritliste = new ArrayList<>();
        int endsprit = 0;
        try {

            File f = new File("C:\\Users\\mlaurs\\IdeaProjects\\AdventOfCode\\Tag1Werte.txt");
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                masse.add(Integer.parseInt(sc.nextLine()));
            }
            for (int g : masse) {
                while (true) {
                    g = g / 3 - 2;
                    if (g < 0) {
                        Spritliste.add(sprit);
                        sprit = 0;
                        break;
                    }
                    sprit = sprit + g;


                }
            }

            for (int g : Spritliste) {
                endsprit = endsprit + g;
            }

            System.out.println(endsprit);


        } catch (FileNotFoundException e) {
            System.out.println("Den gibts nicht");
        }
    }
}
