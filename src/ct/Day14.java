package ct;

import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String [] arr = text.split(" ");


        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        if(a > b){
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else if ( a == b) {
            System.out.println("==");
        }

    }
}
