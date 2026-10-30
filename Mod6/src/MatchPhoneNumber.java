import java.util.regex.Matcher;
import java.util.regex.Pattern;
        /*
        Write a Java regular expression to match phone numbers, with or
        without area codes. The area codes should be of the form (609)
        555-1234 or 555-1234. Name the program MatchPhoneNumber.java
        */
public class MatchPhoneNumber {
    public static void main(String[] args) {
        /*
        Each backslash has to be escaped, and each non grouping paratheses has
        to be escaped with a backslash... which then also needs to
        be escaped with another backslash :(
        */
        String re = "(\\(\\d{3}\\) )?\\d{3}-\\d{4}"; //Set up our phone number pattern with RegEx

        //Seed some phone numbers both good and bad
        String num1 = "(609) 555-1234";
        String num2 = "555-1234";
        String num3 = "1555-1234";
        String num4 = "(125 ) 555-1234";// also won't match based on the extra spaces
        String[] arr = {num1, num2, num3, num4};
        Pattern pattern = Pattern.compile(re);

        for (String s : arr) {
            Matcher matcher = pattern.matcher(s);
            System.out.println(matcher.matches());
        }
    }
}
