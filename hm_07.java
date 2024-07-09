import java.util.Scanner;

public class hm_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讓使用者輸入圓的半徑
        System.out.print("請輸入圓的半徑: ");
        double radius = scanner.nextDouble();

        // 計算圓的面積
        double area = Math.PI * radius * radius;

        // 輸出圓的面積
        System.out.println("圓的面積是: " + area);
    }
}
