package Tag1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Spritkosten {


    public static void main(String[] args) {
        ArrayList<Integer> mass = new ArrayList<>();
        ArrayList<Integer>sprit=new ArrayList<>();
        int ergebnis=0;

        try {

            File f = new File("C:\\Users\\mlaurs\\IdeaProjects\\AdventOfCode\\Tag1Werte.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                mass.add(Integer.parseInt(sc.nextLine()));
            }

            for (Integer v : mass) {
                int speicher= v/3;
                sprit.add(speicher-2);
            }


            for(Integer g: sprit){
                ergebnis=ergebnis+g;
            }

            System.out.println(ergebnis);


        } catch (FileNotFoundException e) {
            System.out.println("suche einen anderen File");
        }


    }
}
