class FindString
{
	public static boolean uniqueSet(String st,int start,int end)
	{
		Set<Character>myset=new hashSet<Character>();
		for(int i=start;i<end;i++)
		{
			if(myset.contains(st.charAt(i)))
				return false;
			mayset.add (st.charAt(i));
		}
				return true;
			
	}
	public static int longString(String st)
	{
		int longestlength=0;
		for(int i=0;i<st.length();i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
			if(uniqueSet(st,i,j)
				longestlength=Math.max(longestlength,j-i)
			
			
			
			}
			
		}
	}
}