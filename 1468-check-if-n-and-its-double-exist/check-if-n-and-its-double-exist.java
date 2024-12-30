class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]==arr[i]*2||arr[i]==arr[j]*2){
                    return true;
                }
            }
        }
        return false;
    }
}