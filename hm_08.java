import java.util.Scanner;

public class hm_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讓使用者輸入姓名、年齡和城市
        System.out.print("請輸入姓名: ");
        String name = scanner.nextLine();

        System.out.print("請輸入年齡: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // 清除緩衝區中的換行符

        System.out.print("請輸入城市: ");
        String city = scanner.nextLine();

        // 輸出使用者輸入的個人資訊
        System.out.println("姓名: " + name);
        System.out.println("年齡: " + age);
        System.out.println("城市: " + city);
    }
}
