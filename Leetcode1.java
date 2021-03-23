/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.*/
public class Leetcode1
{
	public int[] indexFind(int[]array, int target)
	{
		int[] index=new index(2);
		Map<Integer, Integer> mymap=new hashMap<Integer, Integer>();
		for(int i=0;i<array.length();i++)
		{
			mymap.put(array[i],i);
			if(mymap.containsValue(target-array[i]))
				index[1]=i;
				index[2]=mymap.get(target-array[i]);
			
		}
			return index;
		
		
	}
}