package gr.aueb.cf.ch19.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateMatcher {

    public static void main(String[] args) {
        String date = "06/16/2026 01/01/2011 xxx 02/03/2014";     // mm/dd/yyyy

        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher matcher = pattern.matcher(date);

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");

            String month = matcher.group(1);
            String day = matcher.group(2);
            String year = matcher.group(3);

            String grDate = "GR Date: " + day + "/" + month + "/" + year;
            System.out.println(grDate);
        }
    }
}
