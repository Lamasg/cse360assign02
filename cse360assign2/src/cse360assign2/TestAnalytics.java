/**
 * TestAnalytics provides a main method that allows the testing and debugging of the class Analytics
 * the class prints the results of the calculations.
 * @author  Lama Alghamdi
 * Pin: 10
 */
package cse360assign2;


public class TestAnalytics {

	public static void main(String [ ] args)
	{
		Analytics object = new Analytics(); //creates an object of Analytics
		
		int array[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18}; //the values of the array
		
		for(int index = 0 ; index < array.length; index++) //passes the values to object's array
		{
			object.insert(array[index]);
		}
		
		object.print(); //prints the values 

		//testing the analytics calculations
		System.out.println("mean: " + object.mean() );
		System.out.println("median: " + object.median() );
		System.out.println("high: " + object.high() );
		System.out.println("low: " + object.low() );
		System.out.println("numInts: " + object.numInts() );
	}
}
