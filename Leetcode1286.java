import java.util.*;

class CombinationIterator {
    String characters;
    int combinationLength;
    Set<String> set=new TreeSet<>();
    int count;
    int index;
    char[] chararr=null;

    public CombinationIterator(String characters, int combinationLength) {
        this.characters=characters;
        this.combinationLength=combinationLength;
        this.chararr=characters.toCharArray();
        this.count=characters.length();
        String str="";

        dfs(str,0);



    }
    public void dfs(String str,int m){

        if(str.length()==this.combinationLength){
            this.set.add(str);
            return;
        }
        for(int i=m;i<chararr.length;i++){

            str+=chararr[i];
            dfs(str,i+1);
            str=str.substring(0,str.length()-1);
        }
    }

    public String next() {
        List<String> list=new ArrayList<>(this.set);

        String record=list.get(this.index);
        //System.out.print(record);
        while(this.index<list.size()-1){
            this.index++;
        }
        this.count=list.size()-1;
        //System.out.print(this.count);
        return record;
    }

    public boolean hasNext() {
        //System.out.print(this.count);
        if(this.count>0){
            return true;
        }else{
            this.index=0;
            return false;
        }

    }
}
class Leetcode1286{
    public static void main(String[] args) {

        CombinationIterator itr=new CombinationIterator("abc",2);
        while(itr.hasNext()){
            itr.next();
        }

    }
}