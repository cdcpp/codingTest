package ct;

import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a < -1000 || a > 1000 || a ==0){
            return;
        }

        if(b < -1000 || b > 1000 || b ==0){
            return;
        }

        int testa = Integer.signum(a);
        int testb = Integer.signum(b);

        if(testa == 1 && testb ==1){
            System.out.println("1");
        } else if (testa == -1 && testb == 1) {
            System.out.println("2");
        } else if (testa == -1 && testb == -1) {
            System.out.println("3");
        } else if (testa == 1 && testb == -1) {
            System.out.println("4");
        }

    }
}
