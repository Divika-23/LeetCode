class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int tem=nums[i]-1;
                int te=nums[j]-1;
                max=Math.max(max,tem*te);
            }
        }
        return max;
        
    }
}