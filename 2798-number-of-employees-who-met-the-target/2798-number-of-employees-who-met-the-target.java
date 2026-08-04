class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans=0;
        for(int i=0;i<hours.length;i++){
            int temp = hours[i];
            if(temp>=target){
                ans++;
            }
        }
         return ans;
        
    }
}