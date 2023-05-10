package ct;

import java.util.Scanner;

public class First10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gob1 = sc.nextInt();
        String gob2 = sc.next();

        int gob2Arr[] = new int[gob2.length()];

        for(int i=0;i<gob2.length();i++){
            gob2Arr[i] = gob2.charAt(i) - '0';
        }

        int dab1 = gob1 * gob2Arr[0];
        int dab2 = gob1 * gob2Arr[1];
        int dab3 = gob1 * gob2Arr[2];

        System.out.println(dab3);
        System.out.println(dab2);
        System.out.println(dab1);

        int result = dab3 + (dab2 * 10);
        result +=   (dab1 * 100);
        System.out.println(result);


    }
}
