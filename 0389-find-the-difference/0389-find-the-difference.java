class Solution {
    public char findTheDifference(String s, String t) {
        int a[]=new int [26];
        int b[] =new int [26];
        for (int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-'a']++;
            b[t.charAt(i)-'a']++;
        }
        b[t.charAt(t.length()-1)-'a']++;
        int j=0;
        for(j=0;j<26;j++)
        {
            if(a[j]+1==b[j])break;

        }
        return (char) (j+'a');
    }
}