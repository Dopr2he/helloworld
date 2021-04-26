/**
 * @author cyq
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("HELLO");


         /*byte数据的范围*/
        byte a_byte=126;
//        int a_long=12345670000;
        int a_int=20;
        long a_long=1234567890L;
        /*浮点型：默认是double*/
        float a_folat=12.345f;
        double a_dauble=15.555;
        /*字符型：只能存单个字符*/
        char a_char='a';
        char a2_char='b';
        char a3_char='中';
        /*布尔型只有两个值，true和false*/
        boolean a_boolean=true;

        System.out.println("整形byte变量a_byte的值为："+a_byte);
        System.out.println("整形int变量a_int的值为："+a_int);
        System.out.println("整形long变量a_long的值为："+a_long);
        System.out.println("浮点型float变量a_float的值为："+a_folat);
        System.out.println("浮点型double变量a_double的值为："+a_dauble);
        System.out.println("字符型char变量a_char的值为："+a_char);
        System.out.println("字符型char变量a2_char的值为："+a2_char);
        System.out.println("字符型char变量a3_char的值为："+a3_char);
        System.out.println("布尔型boolean变量a_boolean的值为："+a_boolean);
    }

}
