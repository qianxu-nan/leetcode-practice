import java.util.ArrayList;
import java.util.List;

class Solution1415 {
    ArrayList<Character> list=new ArrayList<>(){{add('a');add('b');add('c');}};
    ArrayList<String> strings=new ArrayList<>();
    public String getHappyString(int n, int k) {


        happyString(n,k,new StringBuilder());
        return   strings.size()<k?new String():strings.get(k-1);
    }
    public void happyString(int n, int k,StringBuilder stringBuilder) {

        if(strings.size()==k) return;
        if(stringBuilder.length()==n)
        {
            strings.add(stringBuilder.toString());
            return;
        }
        for(int i=0;i<list.size();i++)
        {
            if(stringBuilder.length()>0&&list.get(i)==stringBuilder.charAt(stringBuilder.length()-1))
                continue;
            stringBuilder.append(list.get(i));
            happyString(n,k,stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}


public class Leetcode1415 {
    public static void main(String[] args) {
        Solution1415 solution=new Solution1415();
        System.out.print(solution.getHappyString(3,9));

    }
}
