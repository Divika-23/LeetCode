class Solution {
    public String convertDateToBinary(String date) {
        // Online Java Compiler
// Use this editor to write, compile and run your Java code online
        StringBuilder sb = new StringBuilder();
            String wrds[]=date.split("-");
        for(int i=wrds.length-1;i>=0;i--){
            String wrd = wrds[i];
            System.out.println(wrd);
        int  x = Integer.valueOf(wrd);
        int temp=x;
        while(temp>0){
            int rem=temp%2;
            sb.append(rem);
            temp/=2;
        }
        sb.append("-");
        }
        sb.reverse();
        sb.deleteCharAt(0);
      return sb.toString();
    }
}
