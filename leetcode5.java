class Leetcode5
{	
	public static boolean palinjudge(String st, int start, int end)
	{
		
		for(int i=start, int j=end;i<=(end-start)/2,i<=(end-start)/2;i++,j--)
		{
			if(st[i]==st[j])
				return ture;
			return false;
		}
			
		
	}
	public static int longestlength(String st)
	{
		int longestlength=0;
		for(int i=0;i<st.length();i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
			if(palinjudge(st,i,j)
				longestlength=Math.max(longestlength,j-i)
			
			
			
			}
			
		}
	}
	
}