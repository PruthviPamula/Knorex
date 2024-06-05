public class q2 {

        public static void generateSeries(int a, int b, int n) {
            int currentSum = a;
            int currentTerm = b;

            for (int i = 0; i < n; i++) {
                currentSum += currentTerm;
                System.out.print(currentSum);
                if (i < n - 1) {
                    System.out.print(" ");
                }
                currentTerm *= 2;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int a1 = 0, b1 = 2, n1 = 10;
            int a2 = 5, b2 = 3, n2 = 5;

            generateSeries(a1, b1, n1);
            generateSeries(a2, b2, n2);
        }
    }
