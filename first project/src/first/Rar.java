package first;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rar {


	public static void main(String[] args) {
        String text = "abcsaaghbbbcddefff";


        Matcher m = Pattern.compile("(.)\\1+").matcher(text);
        while (m.find()) {
            String sub = m.group();
            int len = sub.length();
 
            String sub1 = sub.substring(0,1);
            String sub2 = text.replaceAll(m.group(), len + sub1);  
            System.out.println(sub2);
          
          
          
        }
     
    }
}

