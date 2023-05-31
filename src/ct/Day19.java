package ct;

import java.util.Scanner;

        public class Day19 {
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

        int c = sc.nextInt();

        int d = 0;

        if(c < 0 || c > 1000){
            return;
        }

        if(b + c >= 60){

            d = (b+c) / 60;
            a = a + d;

            if((b+c) % 60 == 0){
                b = 0;
            }else{
                b = (b+c) % 60;
            }

        }else{
            b = b+c;
        }

        if(a > 23){
            int f = a % 24;

            if(f == 0) {
                a = 0;
            }else{
                a = 0 + f;
            }

        }
        System.out.println(a + " " + b);
    }
}
