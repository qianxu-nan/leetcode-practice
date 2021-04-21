import java.util.ArrayList;
import java.util.List;

public class Leetcode46 {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> record=new ArrayList<>();
        boolean[] flag=new boolean[nums.length];
        for(int i=0;i< nums.length;i++){
            flag[i]=false;
        }
        dfs(record,nums,flag);



    }
    public void dfs(List<Integer> arr, int[]nums,boolean[] flag){
        if(arr.size()==nums.length){
            list.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!flag[i]){
                arr.add(nums[i]);
                flag[i]=true;
                dfs(arr,nums,flag);
                arr.remove(nums[i]-1);
                flag[i]=false;
            }


        }

    }
}
