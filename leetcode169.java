import java.util.*;

class leetcode169 {
    public static List<Integer> MajorityElement(int[] arr) {

        Map<Integer,Integer> map=new TreeMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            if(!(map.containsKey(arr[i]))){
                map.put(arr[i],1);
            }
            else{
                int m=map.get(arr[i])+1;
                map.put(arr[i],m);
            }
        }
        Collection<Integer> allvalue=map.values();
        int max=Collections.max(allvalue);
        for(int key:map.keySet()){
            if(map.get(key)==max){
                list.add(key);
            }
        }
        return list;

    }

    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2,1};
        List<Integer> list1=MajorityElement(nums);
        for(int i:list1){
            System.out.print(i+" ");
        }
    }

}