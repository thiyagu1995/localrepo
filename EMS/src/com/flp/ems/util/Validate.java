package com.flp.ems.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
private static Pattern NamePtrn = Pattern.compile("^[a-zA-Z0-9]");
public static boolean validateName(String userName){
    Matcher mtch =NamePtrn.matcher(userName);
    if(mtch.matches()){
        return true;
    }
    return false;
}


}
