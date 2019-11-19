package first;



public class Rar {


	public static void main(String[] args) {
        String foo = "abcsaaghbbbcddefff";
        char[] ch = foo.toCharArray();
        char current = ch[0];
        String result = "";
        int i = 0;
        int counter = 1;
        while(current == ch[i] && i < ch.length - 1) {
         ++i;
         if(ch[i] != current){
        	 if (counter == 1) {
        	 result += String.valueOf(current);
        	 }  else {
        		 result += counter + String.valueOf(current);
        	 }
        	 counter = 1; 
        	 current = ch[i];
        	 continue;
         }
         ++counter;
        }
        
        
        // Handle last char.
   	 if (counter == 1) {
   	 result += String.valueOf(current);
   	 }  else {
   		 result += counter + String.valueOf(current);
   	 }
        
        System.out.println(result);
        
        
        /*Matcher m = Pattern.compile("(.)\\1+").matcher(text);
        while (m.find()) {
            String sub = m.group();
            int len = sub.length();
 
            String sub1 = sub.substring(0,1);
            String sub2 = text.replaceAll(m.group(), len + sub1);  
            System.out.println(sub2);
          */
          
          
        }
     
    }


