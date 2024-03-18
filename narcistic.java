
public class narcistic {
    public static void main(String[] args) {
        int f;
        double power;
        char ch;
        int sum = 0, sumnarsistic = 0;
        String ns;

        for (int i = 100; i < 1000; i++) {
            sum = 0;

            for (int j = 0; j < 3; j++) {
                ns = Integer.toString(i);
                ch = ns.charAt(j);
                f = Character.getNumericValue(ch);
                power = Math.pow(f, 3);
                sum += power;

            }
            if (sum == i) {
                System.out.printf("%d  is a narcissistic number\n", i);
                sumnarsistic += i;
            }
        }
        System.out.printf("Sum of three-digit narcissistic numbers: %d", sumnarsistic);

    }
}
