package Perf;

public class perf {
	public static void main(String[] args) {
        final int LIMIT = 1000;
        for (int i = 2; i < LIMIT; i++) { 
            if (isNumPerfect(i)) {
                System.out.println(i + " is a perfect number");
            }
        }
    }

    public static boolean isNumPerfect(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
