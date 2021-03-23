class LeetCode28 {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        int m=needle.length();
        for(int i=0;i<haystack.length();i++){
        	while(m>=0){
        		if(haystack.charAt(i+m-m)!=needle.charAt(m-m)){
        			break;
        		}
        		else{
        			m--;
        		}
        		if(m==0)
        			return i;
        	}
        }
        return -1;
        
    }
    public static void main(String[]args){
    	String haystack = "aaaaa";
    	String needle = "bba";
    	System.out.println(new LeetCode28().strStr(haystack,needle));
    }
}