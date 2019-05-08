package ua.lpnuai.oop.zaremba05;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static boolean checkData(String userData){
        String regex = ("^(3[01]|[12][0-9]|0[1-9]).(1[0-2]|0[1-9]).[0-9]{4}$");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((CharSequence)userData);
        return matcher.matches();
    }
    public static boolean checkPrice(int userPrice){
        String regex = ("^[0-9]{1,4}$");
        String str = Integer.toString(userPrice);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((CharSequence)str);
        return matcher.matches();
    }


}
