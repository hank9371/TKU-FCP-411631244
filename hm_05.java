/*
Sum            : 19
Difference     : 5
Product        : 84
Quotient       : 1
Remainder      : 5
*/

public class hm_05 {
    public static void main(String[] args) {
        // 宣告並初始化兩個整數變數 a 和 b
        int a = 12;
        int b = 7;

        // 計算和、差、積、商以及餘數
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        // 使用格式化輸出方法來打印結果
        System.out.printf("%-15s: %d%n", "Sum", sum);
        System.out.printf("%-15s: %d%n", "Difference", difference);
        System.out.printf("%-15s: %d%n", "Product", product);
        System.out.printf("%-15s: %d%n", "Quotient", quotient);
        System.out.printf("%-15s: %d%n", "Remainder", remainder);
    }
}
