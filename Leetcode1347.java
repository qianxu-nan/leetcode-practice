import java.util.*;

public class Leetcode1347 {
    public static int minSteps(String s, String t) {
        int[] s_num= new int[26];
        int[] t_num=new int[26];
        for(int i=0;i<s.length();i++){
            s_num[s.charAt(i)-'a']+=1;
            t_num[t.charAt(i)-'a']+=1;
        }
        int result=0;
        for(int i=0;i<26;i++){
            result+=Math.abs(s_num[i]-t_num[i]);


        }
        return result/2;




    }

    public static void main(String[] args) {
        String s1="leetcode";
        String s2="practice";
        minSteps(s1,s2);


    }
}
