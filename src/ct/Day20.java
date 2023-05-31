package ct;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int max = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Integer [] arr = {a,b,c};
        Arrays.sort(arr , Collections.reverseOrder());
        if(a == b && a == c){
            System.out.println(10000 + (a * 1000));
        } else if ((a == b && b != c) || (a == c && a != b)) {
            System.out.println(1000 + (a * 100));
        } else if( (a != b && b == c)){
            System.out.println(1000 + (b*100));
        }
        else if(a != b && a != c){
            System.out.println(arr[0] * 100);
        }
    }
}
