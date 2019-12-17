package Tag6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class aufgabe1 {

    public static void main(String[] args) throws FileNotFoundException {
        int directAndIndirectOrbits = 0;
        HashMap<String, String> orbit = new HashMap();
        File f = new File("C:\\Users\\mlaurs\\IdeaProjects\\AdventOfCode\\Tag6Werte.txt");
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] between = s.split("\\)");

            orbit.put(between[0], between[1]);
        }

        for (String s : orbit.keySet()) {

            while (!orbit.get(s).isEmpty()) {
                directAndIndirectOrbits++;
                    s = orbit.get(s);
                    try {


                        if (orbit.get(s).isEmpty()) {
                            break;
                        }
                    }catch (NullPointerException e){
                        break;
                    }
            }
        }
        System.out.println(directAndIndirectOrbits);
    }
}
