package home_work_1;
public class Task1 {
    public static void main(String[] args) {
        //возможные побитовые операции с числами 42 и 15:
        int a = 42; //00101010
        int b = 15; //00001111
        System.out.println("a = 42, b = 15\na & b = " + (a & b));
        /*
          00101010
        & 00001111
        = 00001010
        */
        System.out.println("a | b = " + (a | b));
        /*
          00101010
        | 00001111
        = 00101111
        */
        System.out.println("a ^ b = " + (a ^ b));
        /*
          00101010
        | 00001111
        = 00100101
        */
        //возможные побитовые операции с числами -42 и -15:
        int c = -42; //-00101010
        int d = -15; //-00001111
        System.out.println("\nc = -42, d = -15\nc & d = " + (c & d));
        /*

        &
        =
        */
        System.out.println("c | d = " + (c | d));
        /*
          00101010
        | 00001111
        = 00101111
        */
        System.out.println("c ^ d = " + (c ^ d));
        /*
          00101010
        | 00001111
        = 00100101
        */
        double f = 42.5;
        //System.out.println("f = 42.5" + ~f);
        //should be int
    }
}
