class LeetCode9
{
	public static boolean panInteger(int x)
	{	 
		int temp=x;
		if(x<0||(x%10==0&&x!=0))
			return false;
	
		int result=0;
		while(x!=0&&x>0)
		{
			result=result*10+x%10;
			x/=10;
		
		}
	
		if(result==temp)
			return true;
		return false;
	


	}
		
	
	public static void main(String[]args)
		{
			System.out.println (panInteger(0));
		}
		
	
}