import java.util.Collections;
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=heights.length;
        int[] temp=new int[n];
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        for(int i=0;i<n;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i=n-1;i>=0;i--){
            temp[i]=heights[n-1-i];
        }
        for(int i=0;i<n;i++){
            names[i]=map.get(temp[i]);
        }
        return names;
    }
}
