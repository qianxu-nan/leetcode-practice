public class Leetcode1079 {

    public int numTilePossibilities(String tiles) {
        int[]record=new int[26];
        for(char a:tiles.toCharArray()){
            record[a-'A']++;
        }
        return dfs(record);

    }
    public int dfs(int[]record){
        int sum=0;
        for(int i=0;i<26;i++){
            if(record[i]==0){
                continue;
            }
            sum++;
            record[i]--;
            sum+=dfs(record);
            record[i]++;

        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
