class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        boolean[] arr=new boolean[n];
        
        ArrayList<Boolean> list =  new ArrayList<Boolean>();
        int max = candies[0];  
         for(int i=1;i<candies.length;i++) 
             if (candies[i]>max) 
                 max=candies[i]; 
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies<max){
                list.add(false);
            }else{
                list.add(true);
            }
        }
        return list;
    }
}
