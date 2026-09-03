class Solution {
    public String reverseWords(String s) {
        String a[]=s.split(" ");
        String x="";
        for (int i =a.length-1;i>=0;i--)
        {
            if (a[i].length()==0)continue;
            x=x+a[i]+" ";}
        return x.trim();
    }
}