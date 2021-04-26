package task07;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner scaanner=new Scanner(System.in);
        int num=scaanner.nextInt();

        if(num%2==0) {
            System.out.println(num + "is even");
        }else{
            System.out.println(num+" is old");

        }
    }
}
