package Tag2;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class aufgabe2 {


    public static void main(String[] args) throws Exception {
        int stelle1;
        int stelle2;

        int mitzaehlen = 0;
        File f = new File("C:\\Users\\mlaurs\\IdeaProjects\\AdventOfCode\\Tag2Werte.txt");
        Scanner sc = new Scanner(f);

        String g = sc.nextLine();

        String[] hallo = g.split(",");

        int[] scurr = new int[hallo.length];
        for (String r : hallo) {

            scurr[mitzaehlen] = Integer.parseInt(r);
            mitzaehlen++;
        }
        for (int noun = 0; noun < 100; noun++) {
            for (int verb = 0; verb < 100; verb++) {
                for (int i = 0; i < hallo.length; i++) {
                    String r = hallo[i];
                    scurr[i] = Integer.parseInt(r);
                }

                scurr[1] = noun;
                scurr[2] = verb;



                for (int i = 0; i < scurr.length; i = i + 4) {
                    if (scurr[i] != 1 && scurr[i] != 2 && scurr[i] != 99) {
                        continue;
                    } else if (scurr[i] == 99) {
                        break;
                    } else if (scurr[i] == 1) {
                        int zweitestelle = scurr[i + 1];
                        int drittestelle = scurr[i + 2];
                        int viertestelle = scurr[i + 3];

                        scurr[viertestelle] = scurr[zweitestelle] + scurr[drittestelle];


                    } else if (scurr[i] == 2) {
                        int zweitestelle = scurr[i + 1];
                        int drittestelle = scurr[i + 2];
                        int viertestelle = scurr[i + 3];


                        scurr[viertestelle] = scurr[zweitestelle] * scurr[drittestelle];

                    }


                }
                //System.out.println(noun+" "+verb);
                if (scurr[0] == 19690720) {
                    stelle1 = noun;
                    stelle2 = verb;
                    System.out.println("Das 'noun' ist " + stelle1 + " und das 'verb' ist: " + stelle2);
                    System.out.println(noun * 100 + verb);
                    return;
                }

            }

        }

    }
}
