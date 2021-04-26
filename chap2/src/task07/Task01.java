package task07;

import jdk.nashorn.internal.parser.Scanner;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author Ahsq
 */
public class Task01 {
    public static void main(String[] args) {
        System.out.println("输入一个输：");
        AtomicReference<Scanner> scanner;
        scanner = new AtomicReference<>(new Scanner(System.in));
        int num=scanner.nextint();
       if(num%2==0)
       {
           System.out.println(num+"is even");
       }
       else
       {
           System.out.println(num+"is odd");
       }


    }
}
