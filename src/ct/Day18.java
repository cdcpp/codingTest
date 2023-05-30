package ct;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String [] arr = text.split(" ");


        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        if(a < 0 || a > 23){
            return;
        }

        if(b < 0 || b > 59){
            return;
        }

        if(b - 45 < 0){

            b = 60 + (b - 45);

            if(a == 0){
                a = 23;


            }else{
                a -= 1;

            }


        }else{
            b -= 45;
        }
        System.out.println(a + " " + b);
    }
}
