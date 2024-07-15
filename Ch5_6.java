public class Ch5_6 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            sum += i;
            System.out.printf("1 + 2 + ... + %d = %d\n", i, sum);
        }
    }
}
