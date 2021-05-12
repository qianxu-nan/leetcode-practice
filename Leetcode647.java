public class Leetcode647 {
    public static int countSubstrings(String s) {

        int result=0;
        boolean[][] dp=new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            for (int j = 0; j < s.length(); j++) {
                dp[i][j]=s.charAt(i)==s.charAt(j)&&(j-i<3||dp[i][j-1]);
                if (dp[i][j]){
                    result++;
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int num=countSubstrings("aaa");
        System.out.println(num);
    }
}
