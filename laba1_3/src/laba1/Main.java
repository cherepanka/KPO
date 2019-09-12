

import java.util.Scanner;

public class Main {

        static String password = "123456";
        static String repeatPassword;
        static String ImputPassword() {
            Scanner pass = new Scanner(System.in);
            System.out.println("Enter password ");
            repeatPassword = pass.nextLine();
            System.out.println("Password " + repeatPassword);
            return repeatPassword;
        }
        static void RepeatPasswords() {
            if (password.equals(repeatPassword))
                System.out.println("Password is true");
            else
                System.out.println("Password is false");
        }
        public static void main(String[] args) {
            ImputPassword();
            RepeatPasswords();
        }
    }
