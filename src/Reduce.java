public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int c = 0;

        while (i > 0) {

            boolean divisibleBy2 = i % 2 == 0;

            if (divisibleBy2) {
                i = i/2;
            }
            else {
                i = i - 1;
            }
            c++;
        }
        System.out.println(c);
    }
}
