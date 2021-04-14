class Leetcode1641 {
    static char[]vowal={'a','e','i','o','u'};
    static int sum=0;
    public static int countVowelStrings(int n) {
        String str="";
        dfs(n,0,str);
        return sum;



    }
    public static void dfs(int n,int x,String str){

        int len=n;

        if(str.length()==n){
            sum++;
            return;
        }
        for(int i=x;i<vowal.length;i++){
            str+=vowal[i];
            dfs(n,i,str);
            str=str.substring(0,str.length()-1);
        }

    }

    public static void main(String[] args) {
        int n=33;
        System.out.print(countVowelStrings(n));

    }
}
