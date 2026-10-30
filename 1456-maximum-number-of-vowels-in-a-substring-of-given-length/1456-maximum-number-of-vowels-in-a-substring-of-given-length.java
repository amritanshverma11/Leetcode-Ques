class Solution {
    public int maxVowels(String s, int k) 
    {
        char []c = s.toCharArray();
        int m=0,v=0;
        for (int i=0;i<k;i++)
        if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
        v++;
        m=v;
        int a=1,b=k;
        while(b<c.length)
        {
            if(c[a-1]=='a'||c[a-1]=='e'||c[a-1]=='i'||c[a-1]=='o'||c[a-1]=='u')
            v--;
            if(c[b]=='a'||c[b]=='e'||c[b]=='i'||c[b]=='o'||c[b]=='u')
            v++;
            m=(v>m)?v:m;
            a++;
            b++;
            
         }
        return m;
    }
}