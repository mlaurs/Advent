package Tag2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class aufgabe1 {


    public static void main(String[] args) throws Exception {

        int mitzaehlen = 0;
        File f = new File("C:\\Users\\mlaurs\\IdeaProjects\\AdventOfCode\\Tag2Werte.txt");
        Scanner sc = new Scanner(f);

        String g = sc.nextLine();

        String[] hallo = g.split(",");

        int[] intcode = new int[hallo.length];
        for (String r : hallo) {

            intcode[mitzaehlen] = Integer.parseInt(r);
            mitzaehlen++;
        }

        for (int i = 0; i < intcode.length; i = i + 4) {
            if (intcode[i] != 1 && intcode[i] != 2 && intcode[i] != 99) {
                throw new Exception();
            } else if (intcode[i] == 99) {
                break;
            } else if (intcode[i] == 1) {
                int zweitestelle = intcode[i + 1];
                int drittestelle = intcode[i + 2];
                int viertestelle = intcode[i + 3];
                intcode[viertestelle] = intcode[zweitestelle] + intcode[drittestelle];

            } else if (intcode[i] == 2) {
                int zweitestelle = intcode[i + 1];
                int drittestelle = intcode[i + 2];
                int viertestelle = intcode[i + 3];
                intcode[viertestelle] = intcode[zweitestelle] * intcode[drittestelle];
            }else if(intcode[i]==3){
                i=i-2;
                continue;
            }else if(intcode[i]==4){

                i=i-2;
                continue;
            }

        }

        System.out.println(Arrays.toString(intcode));
    }
}
