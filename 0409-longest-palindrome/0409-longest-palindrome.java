class Solution {
    public int longestPalindrome(String s) {
        int a[]= new int [26];
        int b[]=new int [26];
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isUpperCase(c))
            a[c-'A']++;
            else
            b[c-'a']++;
        }
        int m=0, l=0;
        for(int i=0;i<26;i++)
        {
            if(a[i]%2==0)
            l+=a[i];
            else { 
                l+=a[i]-1;
            m=1;}
            if(b[i]%2==0)
            l+=b[i];
            else{ 
                l+=b[i]-1;
            m=1;}
            
        }
        return l+m;
    }
}