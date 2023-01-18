package practice;

import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    public static void main(String[] args) {
        String get = "^(LIST)";
        String add = "^(ADD)\\s(\\D)+";
        EmailList emailList = new EmailList();
        String email;

        while (true) {
            String input = new Scanner(System.in).nextLine();
            if (input.equals("")) {
                break;
            } else if (input.matches(add)) {
                email = input.substring(4);
                emailList.add(email);
            } else if (input.matches(get)) {
                emailList.getSortedEmails();
                System.out.println(emailList.getSortedEmails());
            }
        }
    }
}
