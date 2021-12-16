package home_work_1;
public class Task1 {
    public static void main(String[] args) {
        //возможные побитовые операции с числами 42 и 15:
        int a = 42; //00101010
        int b = 15; //00001111
        System.out.println(a & b);
        /*
          00101010
        & 00001111
        = 00001010
        */
        System.out.println(a | b);
        /*
          00101010
        | 00001111
        = 00101111
        */
        System.out.println(a ^ b);
        /*
          00101010
        | 00001111
        = 00100101
        */
        System.out.println(~a); //00101010 ~ 11010101
        System.out.println(a>>1); //00101010 >> 1 = 00010101
        System.out.println(a<<1); //00101010 << 1 = 01010100
        System.out.println(a>>>2); //00101010 >>> 2 = 00001010

        //возможные побитовые операции с числами -42 и -15:
        int c = -42; //11010110
        int d = -15; //11110001
        System.out.println(c & d);
        /*
          11010110
        & 11110001
        = 11010000
        */
        System.out.println(c | d);
        /*
          11010110
        | 11110001
        = 11110111
        */
        System.out.println(c ^ d);
        /*
          11010110
        | 11110001
        = 00100110
        */
        System.out.println(~b); //11110001 ~ 00001110
        System.out.println(b>>1); //11110001 >> 1 = 01111000
        System.out.println(b<<1); //11110001 << 1 = 11100010
        System.out.println(b>>>2); //11110001 >>> 2 = 00111100

        double f = 42.5;
        //System.out.println("f = 42.5" + ~f);
        //побитовые операции только для int(целые), а не double
    }
}
