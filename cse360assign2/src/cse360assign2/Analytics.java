/**
 * The Analytics class is a child class of OrderedIntLIst 
 * it adds methods to calculate the mean, median high ,low and the number of integers in the array
 * @author  Lama Alghamdi
 * Pin: 10
 */

package cse360assign2;

public class Analytics extends OrderedIntList{
	
	/** calculates the mean value by getting the sum of the numbers in the array and dividing by the total number of elements
	 * -1 if empty
	 * @return mean		the calculated value
	 */
	public double mean()
	{
		double meanValue = -1;
		double sum = 0;
		
		if(count != 0)
		{
			for(int index = 0 ; index < array.length ; index++)
			{
				sum = sum + array[index];
			}
		
			meanValue = sum / count;
		}
		
		return meanValue;
	}
	
	/** calculates the median  If there is an odd number of results, the median is the middle number.
	 * If there is an even number of results, the median will be the mean of the two central numbers.
	 * -1 if empty
	 * @return median		the calculated value
	 */
	public int median()
	{
		int middle = count / 2;
		
		if (count != 0)
		{
			if ( count % 2 == 0 )
				return (array[middle - 1] + array[middle]) / 2;
		else
			return array[middle];
		}
		else
			return -1;
	}
	
	/** finds the highest value by returning the last element in the sorted array
	 * -1 if empty
	 * @return highest value
	 */
	public int high()
	{
		if(count != 0)
			return array[count-1];
		else
			return -1;
	}
	
	/** finds the lowest value by returning the first element in the sorted array
	 * -1 if empty
	 * @return lowest value
	 */
	public int low()
	{
		if (count != 0)
			return array[0];
		else
			return -1;
	}
	
	/** returns the number of elements in the array (pre-existing value)
	 * @return count of elements
	 */
	public int numInts()
	{
		return count+1;
	}
}
