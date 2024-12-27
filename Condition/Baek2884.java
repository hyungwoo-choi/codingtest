package Condition;

import java.util.Scanner;

public class Baek2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(b >= 45) {
            b = b - 45;
        }
        else if (b < 45) {
            b = 15 + b;
            if(a < 1){
                a = 23;
            }
            else a--;
        }
        System.out.println(a + " " + b);
    }
}
