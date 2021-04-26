import java.util.Scanner;

/**
 * @author cyq
 */
public class Task03 {
    public static void main(String[] args) {
        /*
        * 1.接受用户键盘输入的整数
        * 2.判断这个整数能不能被７整除
        * ３．输出提示
        * */
        System.out.println("ｓ输入一个整数呗：");
        Scanner sc=new Scanner(System.in);
//        键盘输入的数据保存在num
        int num=sc.nextInt();

        if(num%7==0)
        {
            System.out.println(num+"能被7整除");
        }else{
            System.out.println("不能被7整除");
        }
        if(num%2==0)
        {
            System.out.println(num+"是偶数");
        }else{
            System.out.println("不是偶数");
        }
        int min=num/60;
        int sec=num%60;
        System.out.println(min+"分"+sec+"秒");


       int x=1;

        x = x+9;
        System.out.println(+x);
    }



}
