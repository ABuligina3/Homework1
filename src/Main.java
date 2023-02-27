public class Main {
    public static void main(String[] args) {
        LoginTest MainTester = new LoginTest();
        boolean TrueLogin = MainTester.isLoginValid("Panther_0672884");
        if (TrueLogin) System.out.println("Логин соответствует требованиям");
        else System.out.println("Логин не соответствует требованиям");

    }
}