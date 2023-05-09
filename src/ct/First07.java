package ct;

import java.util.Scanner;

public class First07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();

        if(id.length() > 50 ){
            return;
        }

        System.out.println(id+"??!");


    }
}
