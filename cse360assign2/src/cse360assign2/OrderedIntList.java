/**
 * The OrderedIntList class creates an array of integers sorted in an ascending order. 
 * It places each integer in the right place and expands the array if needed.
 * @author  Lama Alghamdi
 * Pin: 10
 */

package cse360assign2;

public class OrderedIntList 
{
	/** stores sorted integers */
	protected int[] array;
	/** number of sorted integers */
	protected int count; 
	/** controls code execution */
	private boolean debug = true;
	
	/** initializes array to the size of 10 elements*/
	OrderedIntList()
	{
		array = new int[10];
	}
	
	/** inserts value into the array in an ordered position
	 * if the array is empty, insert in position 0
	 * if the array contains integers it will loop to look for the right position
	 * @param value			value to be inserted
	 */
	public void insert(int value) 
	{
		if(debug)
		{
			System.out.println ("debug Ð starting insert");
			System.out.println("Debug - value = "+ value);
		}
		
		if(count == array.length) 
			grow();
		else if(count == 0)
		{
			array[0] = value;
			count = count + 1;
		}
		else
		{
			int loopIndex = 0;
			int secondIndex = 0;
			boolean done = false; 

			while(!done && loopIndex < count)
			{
				if(value < array[loopIndex]) 
					done = true;
				else
					secondIndex = secondIndex + 1;
				
				loopIndex = loopIndex + 1;
			}
			
			for(int index = count ; index > secondIndex ; index--) 
				array[index] = array[index-1];
			
			array[secondIndex] = value; 
			
			count = count + 1;
		}
		
		if(debug)
		{
			System.out.print("Debug Ð count :" + count);
			System.out.println();
		}
	}
	
	/** expands the array if more than 10 values are inserted by
	 * creating a temp array with a bigger size and then updating the existing array
	 */
	private void grow()
	{
		int []temp = new int[count * 2];
		
		for (int index = 0 ; index < count ; index++ )
			temp[index] = array[index];
		
		array = temp;
	}
	
	/** prints the values of array, 5 in each line
	 * if the index is divisible by 5 it will start printing in a new line
	 * 
	 */
	public void print()
	{
		for(int index = 0 ; index < count ; index++) 
		{
			if( index % 5 == 0) 
				System.out.println();
			
			System.out.print(array[index] + "\t");
		}
		
		System.out.println();
	}

}
