public class Main {
    public static void main(String[] args) {
        PasswordGen pass = new PasswordGen(5, 10,3);
        System.out.println(pass.PasswordGenerator());
    }
}