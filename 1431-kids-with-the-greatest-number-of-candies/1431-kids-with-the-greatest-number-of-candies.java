class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max=0;
        ArrayList<Boolean> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int temp = candies[i];
            max=Math.max(temp,max);
        }
        System.out.println(max);
        for(int ele : candies){
            int addel=ele+extraCandies;
            if(addel>=max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return (ans);
        
    }
}