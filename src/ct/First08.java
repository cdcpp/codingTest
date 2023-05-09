package ct;

import java.util.Scanner;

public class First08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bulYear = sc.nextInt();

        if(bulYear < 1000 || bulYear > 3000){
            return;
        }

        System.out.println(bulYear - 543);

    }
}
