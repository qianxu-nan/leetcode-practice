import java. util.*;
import java. lang.*;
class Person implements Comparable<Person>
{
	private String name;
	private int age;
	private int salary;
	public Person(String name, int age,int salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;

	}
	public String toString()
	{
		return("name:"+this.name+";age:"+this.age+"salary"+this.salary);
	}
	public int compareTo(Person per)
	{
		if (this.salary==per.salary)
			if(this.age==per.age)

				return(this.name.compareTo(per.name));
			else
			{
				int numAge=this.age-per.age;
				return numAge;
			}
		else
		{	
			int numSalary=this.salary-per.salary;
			return numSalary;

		}
	}
	public boolean equals (Object obj)
	{
		if(this==obj)
		return true;
		if(!(obj instanceof Person))
		{
			return false;
		}
		Person p= (Person) obj;
		if (this.name.equals(p.name)&&this.age==p.age)
			return true;
			return false;
	}

	public int hashCode()
	{
		return this.name.hashCode()*this.age;
	}	
	
	
}

class CollectionPractice
{
	static 
	{
		System.out.println("qian's leetcode practice");
	}
//leetcode 49. Group Anagrams
	
	public static Map <String,List<String>> tryP(String[] strs)
	{
		
		Map <String,List<String>>kv=new HashMap<String,List<String>>();
     	for(String str:strs)
     	{
     		char[]ch=str.toCharArray();
     		Arrays.sort(ch);
     		String key=String.valueOf(ch);
     		if (!(kv.containsKey(key)))
     		{
     			kv.put(key,new ArrayList<String>());
     			kv.get(key).add(str);
     		}
     		else
     		{
     			kv.get(key).add(str);
     		}
     	}
     	return kv;
   	}
//leetcode 48. Rotate Image(1)
   	public static int[][] rotation1 (int [][] args)
   	{
   		int[][] array=args;
   		for(int i=0;i<array.length;i++)
   		{
   			for(int j=0+i;j<array.length;j++)
   			{
   				if (i!=j)
   				{
   					int temp=array[i][j];
   					array[i][j]=array[j][i];
   					array[j][i]=temp;
   				}
   			}
   		}
   		int num=0;
   		if(array.length%2==1)
   		{
   			num=array.length/2+1;
   		}
   		else
   		{
   			num=array.length/2;
   		}
   		
   		for(int i=0;i<array.length;i++)
   		{
   			for(int j=0;j<num;j++)
   			{
   				int temp=array[i][j];
   				array[i][j]=array[i][array.length-j-1];
   				array[i][array.length-j-1]=temp;
   			}
   		}
   		return array;

   	}
 // leetcode 47 Permutations II 


   	public static void recursive(List<Integer>l1,List<List<Integer>>l2,int[]num)
   	{
   		if(l1.size()==num.length)
   		{
   			l2.add(new ArrayList<>(l1));
   		}
   		else
   		{
   			for(int i:num)
   			{
   				if(!(l1.contains(i)))
   				
   				{
   					l1.add(i);
   					recursive(l1,l2,num);
   					l1.remove(l1.size()-1);
   				}
   			}
   		}
   		
   	}
   	public static List<List<Integer>> permutation1(int[]nums)
   	{
   		List<List<Integer>> parry=new ArrayList <List<Integer>>();
   		List<Integer>par=new ArrayList<Integer>();
   	   	recursive(par,parry,nums);
   		return parry;

   	}
 // leetcode 46 Permutations II
   public static void recursive2(List<Integer>l1,List<List<Integer>>l2,int[]num,boolean[]flag)
   	{
   		if(l1.size()==num.length)
   		{
   			l2.add(new ArrayList<>(l1));
   			return;
   		}
   		else
   		{
   			for(int i=0;i<num.length;i++)
   			{
   				if(flag[i])
   					continue;
   				
                else
   				{ 	
   					flag[i]=true; 
   					l1.add(num[i]);
   					recursive2(l1,l2,num,flag);
   					l1.remove(l1.size()-1);
   					flag[i]=false;
   					while(i<num.length-1&&num[i]==num[i+1])
   					{
   						i++;
   					}
   					
   				}
   			}
   		}
   		
   	}
   		
   	
   	public static List<List<Integer>> permutation2(int[]num2)
   	{
   		List<List<Integer>> pa=new ArrayList <List<Integer>>();
   		List<Integer>parr=new ArrayList<Integer>();
   		Arrays.sort(num2);
   		boolean [] flag1=new boolean[num2.length];
   		System.out.print(flag1[0]);
   	   	recursive2(parr,pa,num2,flag1);
   		return pa;

   	}
   
// leetcode 45 Jump Game II


   	public static int jumpGame (int [] args)
   	{
   		int farreach=0;
   		int nextnode=0;
   		int count=0;
   		for(int i=0;i<args.length-1;i++)
   		{
   			farreach=Math.max(farreach,i+args[i]);	
   			if(i==nextnode)
   			{
   				nextnode=farreach;
   				count++;
   			}	
   		}
   		return count;
   	}

// leetcode 44 whildcard
  

   public static boolean whildcard(String s, String p)
   {
   		boolean[][] match=new boolean[s.length()+1][p.length()+1];
   		match[0][0]=true;
   		
   		for (int j=1;j<p.length()+1;j++)
   		{
   			if(p.charAt(j-1)=='*')
   			{
   				match[0][j]=match[0][j-1];
   			}
   			
   		}
   		for(int i=1;i<s.length()+1;i++)
   		{
   			for(int j=1;j<p.length()+1;j++)
   			{
   				if (s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?')
   				{
   					match[i][j]=match[i-1][j-1];
   				}
   				if(p.charAt(j-1)=='*')
   			
   				{
   					match[i][j]=match[i][j-1] || match[i-1][j];
   				}
   			}
   		}
   		return match[s.length()][p.length()];
   }

//43. Multiply Strings
   public static String multiplyStrings(String num1, String num2)
   {
   	 int l1=num1.length();
   	 int l2=num2.length();
   	 char[] cha1=num1.toCharArray();
   	 char[] cha2=num2.toCharArray();
   	 int[] n1=new int[l1];
   	 int[] n2=new int[l2];
   	 int[] n3=new int[l1+l2];
   	 int carry=0;
   	 
   	 for(int i=0;i<l1;i++)
   	 {
   	 	n1[i]=cha1[i]-'0';
   	 }
   	 for(int i=0;i<l2;i++)
   	 {
   	 	n2[i]=cha2[i]-'0';
   	 }
   	 for(int i=l2-1;i>=0;i--)
   	 {
   	 	if (n2[i]!=0)
   	 	{
   	 		for(int j=l1-1;j>=0;j--)
   	 		{
   	 			n3[i+j+1]=n3[i+j+1]+n1[j]*n2[i];
   	 		}
   	 	}
   	 }
   	 for(int i =n3.length-1;i>=0;i--)
   	 { 			
   	 		int sum = n3[i] + carry;
            carry = sum / 10;
            n3[i] = sum % 10; 		
   	 		 
   	 }
   	 StringBuffer buffer=new StringBuffer();
   	  for(int i=0;i<n3.length;i++)
   	 {  
   	 	
   	 	buffer.append(n3[i]);
   	 }
   	 if (n3[0]==0)
   	 	buffer.deleteCharAt(0);
		return buffer.toString();

   }
 //42. Trapping Rain Water(1)
   public static int trapWater(int[] arg)
   {
   	int leftmax=0;
   	int rightmax=0;
   	int maxsum=0;
   	int i=0;
   	int j=arg.length-1;
   	while(i<j)
   	{
   		leftmax=Math.max(leftmax,arg[i]);
   		rightmax=Math.max(rightmax,arg[j]);
   		if(leftmax<rightmax)
   		{
   			maxsum+=leftmax-arg[i];
   			i++;
   		}
   		else
   		{
   			maxsum+=rightmax-arg[j];
   			j--;
   		}
   		
   	}
   	return maxsum;

   }
   //42.(2)
   public static int watertrap(int []height)
   {
   	int sum=0;
   	int leftmax=0;
   	int rightmax=0;
   	int[]left= new int[height.length];
   	int[]right= new int[height.length];
   	for(int i=0;i<height.length;i++)
   	{
   		left[i]=leftmax;
   		leftmax=Math.max(height[i],leftmax);

   	}
   		for(int i=height.length-1;i>=0;i--)
   	{
   		right[i]=rightmax;
   		rightmax=Math.max(height[i],rightmax);

   	}
   	for(int i=0;i<height.length;i++)
   	{
   		int min=Math.min(left[i],right[i]);
   		if (min>=height[i])
   			sum+=min-height[i];

   	}
   	return sum;
   }
 // 41. First Missing Positive（1）
  public static int fmp(int[]args)
   {
   	int pm=0;
   	List<Integer> l=new ArrayList<Integer>();
   	
   	  Arrays.sort(args);
   	  for(int i=0;i<args.length;i++)
   	  {
   	  	if(args[i]>0)
   	  	{
   	  		l.add(args[i]);
   	  	}
   	  }
   	  	for(int i=1;i<args.length+1;i++)
   	  	{
   	  		if(!l.contains(i))
   	  	
   	  		{
   	  			pm=i;
   	  			break;

   	  		}
   	  	}

   	  	
   	  	return pm;
   }

//41. First Missing Positive(2)(space is constant. canot build a new array)
   public static void swap(int[]nums,int i, int j)
   {
   	 int temp=nums[i];
   	 nums[i]=nums[j];
   	 nums[j]=temp;
   }
   public static int findmp(int[] nums)
   {
   	 for(int i=0;i<nums.length;i++)
   	 {
   	 	while(nums[i]>0&&nums[i] <=nums.length&&nums[nums[i]-1]!=nums[i])
   	 	{
   	 		swap(nums,nums[i]-1,i);
   	 	}
   	 }
   	 for(int i=0;i<nums.length;i++)
   	 {
   	 	if(nums[i]!=i+1)
   	 		{
   	 			return i+1;
   	 		}
   	 }
   	 return nums.length+1;
   }
 //40. Combination Sum 2
   	public static void combin2(int target,int[]nums,List<Integer> lis, List<List<Integer> >result,int index)
   	{
   		if (target==0)
   		{
   			result.add(new ArrayList<Integer> (lis));
   			return;
   		}
   		else if(target>0)
   		{
   		for (int i=index;i<nums.length;i++)
   		
   		{
   			if (nums[i]>target)
   					break;
   			if (i!=index &&nums[i]==nums[i-1])
   					continue;
   			
   				

   				lis.add(nums[i]);
   				
   				combin2(target-nums[i],nums,lis,result,i+1);
   				lis.remove(lis.size()-1);
   			
   		}
   		}
   	}
   	public static List<List<Integer>> cSum2(int target,int[]num)
   {
   		List<List<Integer>> result2=new ArrayList<List<Integer>> ();
   		Arrays.sort(num);
   		combin2(target,num,new ArrayList<Integer>(),result2,0);
   		return result2;



   }


 //39. Combination Sum
   
   	public static void combin(int target,int[]nums,List<Integer> lis, List<List<Integer> >result,int index)
   	{
   		if (target==0)
   		{
   			result.add(new ArrayList<Integer> (lis));
   		}
   		else if(target>0)
   		{
   			for (int i=index;i<nums.length;i++)
   			{
   				if (nums[i]>target)
   					break;
   				lis.add(nums[i]);
   				combin(target-nums[i],nums,lis,result,i);
   				lis.remove(lis.size()-1);
   			}
   		}
   	}
   	public static List<List<Integer>> cSum(int target,int[]num)
   {
   		List<List<Integer>> result=new ArrayList<List<Integer>> ();
   		Arrays.sort(num);
   		combin(target,num,new ArrayList<Integer>(),result,0);
   		return result;



   }
 //38.  Count and Say
   public static String countAndSay(int n)
   {
   		if (n==1)
   			return "1";
		int count=1;
		StringBuilder s = new StringBuilder();
		String str= countAndSay(n-1);
		for (int i=0;i<str.length();i++)
		{
			if(i<str.length()-1&&str.charAt(i)==str.charAt(i+1))
				count++;
			else
			{
				s.append(count+Character.toString(str.charAt(i)));
				count=1;
			}

		}
		return s.toString();
   }
 //37. Sudoku Solver
   public static boolean isValid(char[][]board,int row,int col,int num)
   {

   		for(int i=0;i<9;i++)
   		{
   			if(board[row][i]==(char)(num+'0')||board[i][col]==(char)(num+'0'))
   				return false;
   		}
   		int rownumber=(row/3)*3;
   		int colnumber=(col/3)*3;
   		for (int i=0;i<3;i++)
   		{
   			for(int j=0;j<3;j++)
   			{
   				if(board[rownumber+i][colnumber+j]==(char)(num+'0'))
   					return false;
   			}
   		}
   		return true;

   }

   public static boolean sudo(char[][]board, int row, int col)
   {
   		
   		for(int i=0;i<9;i++)
   		{
   			for(int j=0;j<9;j++)
   			{
   				if (board[i][j]=='.')
   				{
   					for(int num=1;num<10;num++)
   					{
   						int newrow=row+col/8;
   						int newcol=(col+1)%9;
   						if(isValid(board,i,j,num))
   						{
   							board[i][j]=(char)(num+'0');
   							boolean flag=sudo(board,newrow,newcol);
   							if (flag)
   							return true;
   							board[i][j]='.';
   			
   						}
 
   					}
   					return false;
   				}
   			}
   		}
   				
   			
   		return true;			

   	}
 //35. Search Insert Position
   public static int searchInsert(int[] nums, int target)
   {
   		int index=0;
   		Arrays.sort(nums);
   		if (target<nums[0])
   			index=0;
   		else if(target>nums[nums.length-1])
   			index=nums.length-1;
   		
   		else
   		{
   			for(int i=0;i<nums.length;i++)
   		{
   			if (nums[i]==target)
   				index=i;
   			else
   			{
   				if(nums[i]<target&&target<nums[i+1]&&(i+1)<nums.length)
   					index=i+1;
   			}
   		}
   		

   		}
   		return index;
   	}
 //35. Search Insert Position （binary search）
   	 public static int searchInsert2(int[] nums, int target)
   	 {
   	 	if (nums==null||nums.length==0)
   	 		return 0;
   	 	int left=0;
   	 	int right=nums.length-1;
   	 	
   	 	while(left+1<right)//avoid the two point overlap
   	 	{
   	 		int mid=left+(right-left)/2;//avoid the owerflow
   	 	
   	 		if(nums[mid]>target)
   	 			right=mid;
   	 		else if (nums[mid]<target)
   	 			left=mid;
   	 		else 
   	 			return mid;
   	 	}
   	 	if(nums[left]<=target)
   	 		return 0;
   	 	else if(target>nums[right])
   	 		return right+1;
   	 	else return right;

   	 }
 //34. Find First and Last Position of Element in Sorted Array

   	public static int searchRightIndex(int[]nums,int left,int right,int target)
   	{
   		while(left<=right)
   		{
   			int mid=left+(right-left)/2;
   			if(nums[mid]>target)
   				right=mid-1;
   			else left=mid+1;
   		}
   		return right;
   	}
   	public static int searchLeftIndex(int[]nums,int left,int right,int target)
   	{
   		while(left<=right)
   		{
   			int mid=left+(right-left)/2;
   			if(nums[mid]<target)
   				left=mid+1;
   			else right=mid-1;
   		}
   		return left;
   	}
   	
   	public static int[] searchRange(int[] nums, int target)
   	{
   		int [] range={-1,-1};
   		if(nums==null||nums.length==0)
   			return range;
   		int index=searchRightIndex(nums,0,nums.length-1,target);
   		if(index<0||nums[index]!=target)
   			return range;
   		range[0]=searchLeftIndex(nums,0,index,target);
   		range[1]=index;
   		return range;




   	}
 //34. (2)
   	public static int searchLeftIndex2(int[]nums,int target,int left,int right)
   	{
   		if(left>right)
   			return (left<nums.length&&nums[left]==target)? left:-1;
   			int mid=left+(right-left)/2;
   			if(nums[mid]<target)
   				return searchLeftIndex2(nums,target,mid+1,right);
   			else return searchLeftIndex2(nums,target,left,mid-1);
   	}
   		public static int searchRightIndex2(int[]nums,int target,int left,int right)
   	{
   		if(left>right)
   			return (right>=0&&nums[right]==target)? right:-1;
   			int mid=left+(right-left)/2;
   			if(nums[mid]>target)
   				return searchRightIndex2(nums,target,left,mid-1);
   			else return searchRightIndex2(nums,target,mid+1,right);
   	}
   	public static int[] searchRange2(int[] nums, int target)
   	{
   		int [] range={-1,-1};
   		if(nums==null||nums.length==0)
   			return range;
   		range[0]=searchLeftIndex2(nums,target,0,nums.length-1);
   		range[1]=searchRightIndex2(nums,target,0,nums.length-1);
   		return range;
   	}
   	
   		
   				
   	
   

	public static void main (String [] args)
	{
		int[] nums={5,7,7,8,8,9};
		System.out.println(searchRange2(nums,7)[0]+" "+ searchRange2(nums,7)[1]);
		
			
		
	}
}