package ct;

import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gab = sc.nextInt();
        for(int i = 1;i<=9;i++){
            System.out.println(gab + " * " + i + " = " + gab*i);
        }
    }
}
