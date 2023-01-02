class Solution {
    public int garbageCollection(String[] g, int[] t) {
        int a[]=new int[3];
        int k=g.length;
        String c[] = {"M", "P", "G"};
        for(int i=0;i<3;i++)
        {
            for(int j=k-1;j>=0;j--)
            {
                if(g[j].contains(c[i]))
                {
                    a[i]=j;
                    break;
                }
            }
        }
        int s=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<a[i];j++)
            {
                s+=t[j];
            }
        }
        for(int i=0;i<k;i++)
        {
            s+=g[i].length();
        }
        return s;
    }
}
