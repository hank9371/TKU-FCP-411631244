import java.util.Scanner;

public class hm_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讓使用者輸入兩個整數
        System.out.print("請輸入第一個整數: ");
        int num1 = scanner.nextInt();

        System.out.print("請輸入第二個整數: ");
        int num2 = scanner.nextInt();

        // 計算兩數之和
        int sum = num1 + num2;

        // 輸出兩數之和
        System.out.println("兩數之和是: " + sum);
    }
}
