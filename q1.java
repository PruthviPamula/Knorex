public class q1 {
    public static class ReverseInteger {
        public int reverse(int x) {
            int reversed = 0;

            while (x != 0) {
                int pop = x % 10;
                x /= 10;


                if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) {
                    return 0;
                }
                if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) {
                    return 0;
                }

                reversed = reversed * 10 + pop;
            }

            return reversed;
        }

        public static void main(String[] args) {
            ReverseInteger ri = new ReverseInteger();

            int x1 = 123;
            int x2 = -123;
            int x3 = 120;

            System.out.println("Reversed " + x1 + " is " + ri.reverse(x1));  // 321
            System.out.println("Reversed " + x2 + " is " + ri.reverse(x2));  // -321
            System.out.println("Reversed " + x3 + " is " + ri.reverse(x3));  // 21
        }
    }

}
