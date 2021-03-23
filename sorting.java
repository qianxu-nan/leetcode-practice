//all kinds of sorting
class SortControl
{
	public static void insortionSorting(int[]array)
	{
		for(int i=1;i<array.length;i++)
		{
			int temp=array[i];
			int leftindex=i-1;
			while(leftindex>=0&&array[leftindex]>temp)
			{
				array[leftindex+1]=array[leftindex];
				leftindex--;
			}
		
			array[leftindex]=temp;
		}
		
	}
	public static void bubbleSorting(int[]array)
	{
		for(int x=0;x<array.length-1;x++)
		{
			for(int y=0;y<array.length-1;y++)
			{
				if (array[y]>array[y+1])
				{
					int temp =array[y];
					array[y]=array[y+1];
					array[y+1]=temp;
				}
			}
				
		}
		
	}
	public static void selectionSorting(int[]array)
	{
		for(int x=0;x<array.length-1;x++)
		{
			int mindex=x;
			for(int y=x+1;y<array.length-1;y++)
			{
				if(array[y]<array[mindex])
					mindex=y;
				
			}
			int temp=array[x];
			array[x]=array[mindex];
			array[mindex]=temp;
		
		}
		
	public static void shellSorting(int()array)
	{
		for(int gap=gap/2;gap<array.length;gap/=2)
		{
			for(int i=gap;i<array.length;i+=gap)
				int temp=array[gap];
				int leftindex=i-gap;
				while(leftindex>=0&&array[leftindex]>temp)
				{
					array[leftindex+1]=array[leftindex];
					leftindex--;
				}
				array[leftindex]=temp;
		}
		
class MergeSort
{
	public void sort(int[]arr, int start, int end, int mid)
	{
		if(start<end)
		{
		mid=(start+end)/2;
		sort(arr, start,mid,temp);
		sort(arr,mid+1,end,temp);
		merge(arr,start,mid,end,temp);
		}
		
	}
	public void merge(int[]array,int start, int mid, int end)
	{
		int[]temp=new int[array.length];
		
		int y=mid+1;
		int z= start;
		while(start<=mid&&y>=end)
		{
			if(array[start]>array[y])
			{
				temp[z++]=array[y++];
			}
			else(array[start]<array[y])
			{
				temp[z++]=array[start++];
			}
		while(start<=mid)
		{
			temp[z++]=array[start++];
		}
		while(y>=end)
		{
			temp[z++]=array[y++];
		}
		}
		
	}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
		
		
		
		
		
	}
}