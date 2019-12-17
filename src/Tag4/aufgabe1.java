package Tag4;

public class aufgabe1 {


    public static void main(String[] args) {
        int zaehlen=0;
        for (int i = 284639; i <=748759 ; i++) {
                    String dieZahl = ""+i;
                    char [] a=dieZahl.toCharArray();
            if(a[0]<=a[1]&&a[1]<=a[2]){
                if (a[2]<=a[3]&&a[3]<=a[4]){
                    if (a[4]<=a[5]){
//                        if(a[0]==a[1]||a[1]==a[2]||a[2]==a[3]||a[3]==a[4]||a[4]==a[5]){
//                            zaehlen++;
//                        }
                        if(a[0]==a[1]&&a[1]<a[2]||a[1]==a[2]&&a[2]<a[3]&&a[1]>a[0]||a[2]==a[3]&&a[3]<a[4]&&a[2]>a[1]||a[2]<a[3]&&a[3]==a[4]&&a[4]<a[5]||a[4]==a[5]&&a[4]>a[3]){
                            zaehlen++;
                        }
                    }
                }
            }
        }
        System.out.println(zaehlen);
    }
}
