class Solution
{
    public int countAsterisks(String s)
    {
        int count = 0, ret = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == '*')
                if(count % 2 == 0)
                    ret++;
            if(ch == '|')
                count++;
        }
        return ret;
    }
}
