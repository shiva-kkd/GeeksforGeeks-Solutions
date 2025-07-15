class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length, r=-1, i;
        Arrays.sort(arr);
        for(i=0; i<n; i++){
            if(arr[i]!=i+1){
                //r=i+1;
                break;
            }
        }
        r=i+1;
        return r;
    }
}