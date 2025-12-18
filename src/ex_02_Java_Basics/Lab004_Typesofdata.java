package ex_02_Java_Basics;

public class Lab004_Typesofdata {
    public static void main(String[] args) {
//   byte can take upto 127 to -127 characters only
        byte a = 127;
        byte b = 127;
        short a2 = 128;
        short b2 = 129;
//        int phone = 987654321 (will not accept longer values as it has specific length)
        int a1 = 10+10;
        int b1  = 5+5;
        int _123 = 123;
//        char is an integral and can enter numeric values aswell
        char c = '@';
        char c1 = '!';
//      Long value should end with l or L
        long phone = 987654321l;
        long phone1 = 987654321L;
//      float  will have only decimal and f or F should be at the end
        float f = 3.54f;
        float f1 = 5.43F;
//        double
        double d = 1.1111111111;
        double d1 = 2.2222222222;

        System.out.println(a2+b2);
        System.out.println(a+a);
        System.out.println(b+b1);
        System.out.println(c);
        System.out.println(phone);
        System.out.println(phone1);
        System.out.println(f);
        System.out.println(f1);
        System.out.println(d);
        System.out.println(d1);
    }
}


