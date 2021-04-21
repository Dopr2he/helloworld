import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        System.out.println("输入一个数");
        Scanner sc=new Scanner(System.in);
//        键盘输入的数据保存在num
        int num=sc.nextInt();
        if(num>3&num<6)
        {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
if((num%3==0&num%7==0)) {
    System.out.println("可以被３和７整除");}
        else { System.out.println("不可以被３和７整除"); }


    }

}
