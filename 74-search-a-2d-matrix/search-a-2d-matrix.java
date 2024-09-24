class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Linear Search 
        /*
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
        */
        //Binary Search
        int r=matrix.length;
        int c=matrix[0].length;
        int s=0,e=r*c-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            int val = matrix[mid/c][mid%c];
            if(target==val){
                return true;
            }
            else if(target>val){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;
    }
}