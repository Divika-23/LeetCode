class Solution {
    public boolean checkGoodInteger(int n) {
        int digitsum=0;
        int sqsum=0;
        boolean ans=false;
        int num=n;
        while(num>0){
            int rem =num%10;
            digitsum+=rem;
            sqsum+=rem*rem;
            num/=10;
        }
        int res =sqsum-digitsum;
        if(res>=50){
            ans = true;
        }
        return ans;
    }
}