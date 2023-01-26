import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers would you like in password:");
        int nums = sc.nextInt();
        System.out.println("How many letters would you like in password:");
        int letters = sc.nextInt();
        System.out.println("How many symbols would you like in password:");
        int symbols = sc.nextInt();

        PasswordGen pass = new PasswordGen(nums, letters,symbols);
        System.out.println(pass.PasswordGenerator());
    }
}