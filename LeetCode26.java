class LeetCode26 {
    public int removeDuplicates(int[] nums) {
    	int n=1;
    	int j=1;
    	while(j<nums.length){
    		if(nums[j]==nums[n-1]) j++;
    		else{
    			nums[n]=nums[j];
    			n++;
    		}
    	}
    	    	return n;
        
    }
    public static void main(String[]args){

    	int[] nums = {1,1,2};
    	System.out.println(new LeetCode26().removeDuplicates(nums));
    }
}