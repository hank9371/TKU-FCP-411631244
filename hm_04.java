/*
The sum of a and b is: 15
The difference of a and b is: 5
The product of a and b is: 50
The quotient of a and b is: 2
*/

public class hm_04 {
    public static void main(String[] args) {
        // 宣告並初始化兩個整數變數 a 和 b
        int a = 10;
        int b = 5;

        // 計算和、差、積和商
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;

        // 打印結果
        System.out.println("The sum of a and b is: " + sum);
        System.out.println("The difference of a and b is: " + difference);
        System.out.println("The product of a and b is: " + product);
        System.out.println("The quotient of a and b is: " + quotient);
    }
}
