package first;

public class NumberOfUnicSymbInStirng {

	public static void main(String[] args) {
		String myString = "aababagalamaga";
		int index1 = myString.indexOf('b'); 
		int index2 = myString.indexOf("lamaga");
		int index3 = myString.indexOf("m");
		int index4 = myString.lastIndexOf('a');
		int charCount = myString.replaceAll("[^a]", "").length();
		int charCount1 = myString.replaceAll("[^b]", "").length();

		//int count = myString.countMatches("aababagalamaga", "a");
		//int count = myString.split(mySring, 'a');
				
		System.out.println("first 'b' situated on: " + index1 + " place");
		System.out.println("first 'lamaga' situated on: " + index2 + " place");
		System.out.println("first 'm' situated on: " + index3 + " place");
		System.out.println("last 'a' situated on: " + index4 + " place");
		
		System.out.println("count of unique a = " + charCount);
		System.out.println("count of unique b = " + charCount1);
	}
	/*public static void again(String[] args) {
		String str = "abubu";
		int occurrences = 0;
		int index = 0;
		while (index < str.length() && (index = str.indexOf(index)) >= 0) {
		    occurrences++;
		}   
	   System.out.println("count of unique b = " + occurrences);
		    //index + 3; //length of 'the'
		
	}*/
}
	
