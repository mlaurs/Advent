package Tag6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class aufgabe1 {

    public static void main(String[] args) throws FileNotFoundException {
        int directAndIndirectOrbits = 0;
        HashMap<String, ArrayList<String>> orbit = new HashMap();
        File f = new File("C:\\Users\\mlaurs\\IdeaProjects\\AdventOfCode\\Tag6Werte.txt");
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] between = s.split("\\)");
            if (orbit.containsKey(between[0])) {
                ArrayList<String> a = orbit.get(between[0]);
                a.add(between[1]);
                orbit.put(between[0], a);
            } else {
                ArrayList<String>b= new ArrayList<>();
                b.add(between[1]);
                orbit.put(between[0], b);
            }
        }

        for (String s : orbit.keySet()) {

            while (!orbit.get(s).isEmpty()) {
                directAndIndirectOrbits++;
               ArrayList<String> a = orbit.get(s);
               if(a.size()==1){
                   s=a.get(0);
               }else {
                   for (int i = 0; i <=a.size() ; i++) {
                        directAndIndirectOrbits+=a.size();

                   }
               }
                try {
                    if (orbit.get(s).isEmpty()) {
                        break;
                    }
                } catch (NullPointerException e) {
                    break;
                }
            }
        }
        System.out.println(directAndIndirectOrbits);
    }





    public static String bestimmenvonValuekeys(){

    }

}
