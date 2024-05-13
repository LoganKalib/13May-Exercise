package za.ac.cput.utils;

import org.apache.commons.validator.routines.EmailValidator;
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Employee;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {
    public static boolean testLong(Long obj){
        return obj != null;
    }

    public static boolean testString(String obj){
        return obj != null && !obj.isEmpty();
    }

    public static boolean testEmail(String obj){
        return EmailValidator.getInstance().isValid(obj);
    }

    public static boolean testContact(Contact obj){
        return obj !=null;
    }
    public static boolean testEmployee(Employee obj){
        return obj !=null;
    }

    public static boolean testValidContact(String obj){
        String regexPattern = "^\\d{10}$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(obj);
        return matcher.matches();
    }

    public static Long generateId(){
        return UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
    }
}
