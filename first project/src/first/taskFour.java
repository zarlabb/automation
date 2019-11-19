package first;
import java.util.*;

public class taskFour {
	public static void main(String[] args) {
		int array1[] = new int [10];
		int array2[] = new int [27];
		int array3[] = new int [15];
		int array4[] = new int [50];
		
		// Populate arrays.
		PopulateArray(array1);
		PopulateArray(array2);
		PopulateArray(array3);
		PopulateArray(array4);
		
		// Display arrays.
		DisplayArray(array1);
		System.out.println();
		DisplayArray(array2);
		System.out.println();
		DisplayArray(array3);
		System.out.println();
		DisplayArray(array4);
		System.out.println();
		
		// Populate map.
		Map<Integer, Integer> result = new HashMap<Integer, Integer>(); 
		PopulateMap(result, array1);
		PopulateMap(result, array2);
		PopulateMap(result, array3);
		PopulateMap(result, array4);
		
		// Display map.
		DisplayMap(result);
	}
	
	public static void PopulateArray(int[] array) 
	{
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = GetRandomValue();
		}
	}
	
	public static void DisplayArray(int[] array) 
	{
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}
	}
	
	public static int GetRandomValue() 
	{
		return (int)(Math.random() * 100 + 1);
	}
	
	public static void PopulateMap(Map<Integer, Integer> map, int[] array) 
	{
		for (int i = 0; i < array.length; i++) 
		{
			int value = array[i];
			if (map.containsKey(value)) 
			{
				map.put(value, map.get(value) + 1);
			}
			else 
			{
				map.put(value, 1);
			}
		}
	}
	
	public static void DisplayMap(Map<Integer, Integer> map)
	{
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
		{
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
