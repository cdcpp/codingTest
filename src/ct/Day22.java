package ct;

import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int [] gg = new int[count];
        for(int i=0;i<count;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a < 0 || b < 0 || a > 10 || b > 10){
                return;
            }
            gg[i] = a+b;
        }
        for(int i=0;i < gg.length;i++){
            System.out.println(gg[i]);
        }
    }
}
