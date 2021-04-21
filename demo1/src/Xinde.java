public class Xinde {
    public static void main(String[] args) {
        int a=298;
        byte b;
//        从大到小，需要强制转换类型
        b=(byte)a;
        System.out.println("a="+a);
//        强制转换导致类型丢失
        System.out.println("b="+b);

        byte a1=3;
        byte a2=4;
//       这里为什么会出错
int  a3=a1+a2;
        System.out.println("a3="+a3);
        System.out.println("hello"+'a'+1);
        System.out.println('a'+1+"hello");

    }
}
