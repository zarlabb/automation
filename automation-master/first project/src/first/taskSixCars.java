package first;
import java.io.*;
import java.util.*;

public class taskSixCars {

	public static List<Car> _cars = new ArrayList<Car>();
	
	public static void main(String[] args) {
		Scanner sc = null;
		try 
		{
			  File file = new File("Cars.txt");
			  
			  
			  sc = new Scanner(file);
			  
			  String st; 
			  while (sc.hasNextLine()) 
			  {
				  String line = sc.nextLine();
				  String[] array = line.split(",");
				  
				  _cars.add(new Car(array[0], Integer.parseInt(array[1]), Integer.parseInt(array[2])));
			  }
		}
		
		catch (FileNotFoundException e) 
		{
			
		}
		
		finally 
		{
			if (sc != null)
				sc.close();
		}
	
		System.out.println(TotalFuel("Porsche"));
	}
	
	public static int TotalFuel(String name) 
	{
		Car car = _cars.stream().filter(c -> c.GetName().equals(name)).findFirst().get();
		if (car == null)
			return -1;
		
		return car.GetMileage() / 100 * car.GetConsumption();
	}
	
	public static class Car 
	{
		private String _name;
		private int _mileage;
		private int _consumption;
		
		Car(String name, int mileage, int consumption)
		{
			_name = name;
			_mileage = mileage;
			_consumption = consumption;
		}
		
		public String GetName() 
		{
			return _name;
		}
		
		public int GetMileage() 
		{
			return _mileage;
		}
		
		public int GetConsumption() 
		{
			return _consumption;
		}
	}
}
