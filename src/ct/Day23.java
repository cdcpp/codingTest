package ct;

import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        if(count < 0 || count > 10000){
            return;
        }
        int dab = 0;

        for(int i = 1;i<=count;i++){
            dab += i;
        }
        System.out.println(dab);
    }
}
