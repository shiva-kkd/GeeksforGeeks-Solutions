class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        //List<Integer> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        int i, j;
        int n=arr.length;
        for(i=0; i<n; i++){
            for(j=i+1; j<n; j++){
                if(arr[i]<arr[j]) break;
            }
            if(j==n) list.add(arr[i]);
        }
        return list;
    }
}
