class Solution {
    public String convert(String s, int n) {
        if(n==1)return s;
        StringBuilder a[]= new StringBuilder[n];
        StringBuilder b= new StringBuilder();
        for(int i=0;i<n;i++)
        a[i]=new StringBuilder();
         
         int i=0;
         outer:
         while(i<s.length())
         {
            for(int x=0;x<n;x++)
            {
                a[x].append(s.charAt(i++));
                if(i==s.length())break outer;
            }
            for(int x=n-2;x>0;x--)
            {
                a[x].append(s.charAt(i++));
                if(i==s.length())break outer;
            }
         }
         for(int j=0;j<n;j++)
        b.append(a[j]);
        return b.toString();
    }
}