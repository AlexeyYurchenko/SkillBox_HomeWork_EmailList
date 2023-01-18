package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {
    TreeSet<String> emailList = new TreeSet<>();

    public void add(String email) {
        String newMail = (email != null && !email.isEmpty()) ? email.toLowerCase() : "";
        Pattern pattern = Pattern.compile("^[a-zA-Z\\d.!#$%&'*+/=?^_`{|}~-]+@((\\[\\d{1,3}\\.\\d{1,3}\\.\\d" +
                "{1,3}\\.\\d{1,3}])|(([a-zA-Z\\-\\d]+\\.)+[a-zA-Z]{2,}))$");
        Matcher matcher = pattern.matcher(newMail);
        if (matcher.find()) {
            emailList.add(newMail);

        } else {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
        }
    }

    public List<String> getSortedEmails() {
        return new ArrayList<>(emailList);
    }
}