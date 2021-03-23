class Leetcode7
{
	public static String zzConversion (String st, int nRow)
	{
		if(nRow==1)
			return st;
		StringBuffer result=new StringBuffer()
		int interval=nRow<<2-2;
		for(int i=0; i<nRow;i++)
			for(int j=0;(j+i)<st.length();j+=interval )
			{
				result=result.append(st(j+i));
				if (i!=0&&i!=nRow-1&&j+interval-i<st.length())
					result=result.append(st(j+interval-i));
			}
			String re= result.toString();
			return re;
	}
}