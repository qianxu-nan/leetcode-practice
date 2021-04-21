class Solution1277 {
    public int countSquares(int[][] matrix) {
        int row= matrix.length;
        int column=matrix[0].length;
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(i>0&&j>0&&matrix[i][j]>0){
                    matrix[i][j]=Math.min(matrix[i-1][j-1],Math.min(matrix[i-1][j],matrix[i][j-1]))+1;
                }
                sum+=matrix[i][i];
            }
        }
        return sum;

    }
}