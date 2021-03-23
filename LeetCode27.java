class LeetCode27 {
    public int removeElement(int[] nums, int val) {
    	int j=0;
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]==val) continue;
    		else{
    			nums[j]=nums[i];
    			j++;
    		}
    	}
    	return j;
        
    }
    public static void main(String[]args){
    	int[] nums = {0,1,2,2,3,0,4,2};
    	int val = 2;
    	System.out.println(new LeetCode27().removeElement(nums,val));
    }
}