class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        String str1=s.substring(0,n/2);
        String str2=s.substring(n/2,n);
        int count1=0,count2=0;
        for(int i=0;i<str1.length();i++){
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' ||str1.charAt(i) == 'o' || str1.charAt(i) == 'u'||str1.charAt(i) == 'A' || str1.charAt(i) == 'E' || str1.charAt(i) == 'I' ||str1.charAt(i) == 'O' || str1.charAt(i) == 'U'){
                count1++;
            }
            if (str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'i' ||str2.charAt(i) == 'o' || str2.charAt(i) == 'u'||str2.charAt(i) == 'A' || str2.charAt(i) == 'E' || str2.charAt(i) == 'I' ||str2.charAt(i) == 'O' || str2.charAt(i) == 'U'){
                count2++;
            }
        }
        if(count1==count2){
            return true;
        }else{
            return false;
        }
    }
}
