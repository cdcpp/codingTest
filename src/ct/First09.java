package ct;

import java.util.Scanner;

public class First09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String [] arr = text.split(" ");


        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        int [] intArr = {a,b,c};

        for(int i = 0; i < intArr.length; i++){
            if(intArr[i] < 2 || intArr[i] > 10000){
                return;
            }
        }

        System.out.println((a+b)%c);
        System.out.println(((a%c) + (b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c) * (b%c))%c);

    }
}
