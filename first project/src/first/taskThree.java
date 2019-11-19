package first;

public class taskThree {
static String array[] = new String[] {
		"*", "2 ", "3 ", "4 ", "* ", "6 ", "* ", "8 ", "* ", "10", "11", "12", "*", "14", 
		"15", "16", "*", "18", "*", "20", "*", "22", "23", "24", 
		 "*"};

public static void main(String[] args) {
	int n = 5;
	for (int i = 0; i < n; i++) 
	{
		for (int j = 0; j < n; j++) 
		{
			System.out.print(array[i * n + j] + " ");
		}
		System.out.println();
	}
}

}

