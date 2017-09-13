import java.util.ArrayList;

public class ArrayListBasics
	{
public static void main(String[] args)
	{
		// challenge one
		ArrayList <Double> myArray = new ArrayList <Double>( );

		// challenge two
		myArray.add(99.0);
		myArray.add(99.5);
		myArray.add(96.3);
		myArray.add(97.9);
		myArray.add(98.4);
		myArray.add(100.5);
		myArray.add(101.0);
		myArray.add(95.9);
		myArray.add(94.3);
		myArray.add(100.7);
		
		for(int i = 0 ; i < myArray.size() ; i++){
			
			System.out.println(myArray.get(i) + " degrees Fahrenheit");
		}
		
		// challenge three
		int numberOfPeopleWithFev = 0;
		
		for(int i = 0 ; i < myArray.size() ; i++){
			
			if(myArray.get(i) > 98.6){
				
			System.out.println("Uh Oh! You have a fever! Your tempature is " + myArray.get(i) + " degrees Fahrenheit.");
			
			numberOfPeopleWithFev = numberOfPeopleWithFev + 1;
			}
		}
		
		System.out.println("There are " + numberOfPeopleWithFev + " people with fevers.");
		
		// challenge four
		
		for(int i = 0 ; i < myArray.size() ; i++){
			
			double cToF = myArray.get(i);
			
			double subtractFunction = cToF - 32;
			
			double divideFunction = subtractFunction / 1.8;
			
			System.out.println(divideFunction + " degrees Celsius");
			
		}
		// challenge five
		
		for(int i = 0 ; i < myArray.size() ; i++){
			
			if(myArray.get(i) > 98.6){
				
				myArray.remove(i);
			}
		}
		
		System.out.println("Healthy people:");
		
		for(int i = 0 ; i < myArray.size() ; i++){
			
			System.out.println(myArray.get(i));
			
		}
			
		
	}
	}
