public class LeetCode8
{
	public static int atoi(String st)
	{	
	
		if(str[0]<'0'&&str[0]>'9'&&str==null&&str.length()<1)
			return 0;
		String str=st.trim();
		int i=0;
		int sign=1;
		int result=0;
		
		
		if(str[0]=='+'||str[0]=='-')
		{
			sign=(str[0]=='+')?1:-1;
			i++;
		}
		while(str[i]>='0'&str[i]<='9')
		{
			result=reslut*10+str[i]-'0';
			i++;
		}
		result=sign*result;
		if(result>Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if(result>Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		return result;
	

	}
}