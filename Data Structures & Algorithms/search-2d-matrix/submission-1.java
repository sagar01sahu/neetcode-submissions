class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int m=matrix.length;
    int n=matrix[0].length;
    int i=0;
    int j=n-1;
    while(i<m && j>=0){
      if(matrix[i][j]<target){
        i=i+1;
      }
      else if(matrix[i][j]>target){
        j-=1;
      }
      else{
        
        return true;
      }
    }
    return false;
    }
}
