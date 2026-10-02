class Solution {
    public String sortString(String s) {
        int n=s.length();
        StringBuilder a= new StringBuilder();
        int l[]= new int [26];
        for(char c:s.toCharArray())
        l[c-'a']++;
        int x=0,y=25;
        while(a.length()<n)
        {
            if(x<26)
            {
                if(l[x]!=0)
                {a.append((char)('a'+x));
                l[x]--;}
                x++;
                if(x==26)y=25;
            }
            else 
            {
                if(l[y]!=0)
                {a.append((char)('a'+y));
                l[y]--;}
                y--;
                if(y==-1)x=0;
            }
        }
        return a.toString();
    }
}