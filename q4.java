public class q4 {
        public static int warnPrisoner(int n, int m, int s) {
            int finalPosition = (s + m - 1) % n;
            return finalPosition == 0 ? n : finalPosition;
        }
        public static void main(String[] args) {
            System.out.println(warnPrisoner(5, 2, 1));
            System.out.println(warnPrisoner(5, 2, 2));
            System.out.println(warnPrisoner(7, 19, 2));
        }
    }

