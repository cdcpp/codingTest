package ct;

public class Day01 {
    //사칙연산
    public static void main(String[] args) {
       int res = 1;
       for(int i=0; i< 10; i++){
           res = res * 2;
           System.out.println( i + "=" + res);
       }
        System.out.println(res);
    }
}
