class Solution {
    public String longestCommonPrefix(String[]a )
    {
        int n=a.length;
        String p=a[0],s;
    for (int i=1;i<n;i++)
    {s="";
        int l=Math.min(p.length(),a[i].length());
        for (int j=0;j<l;j++)
        {  
          if (a[i].charAt(j)==p.charAt(j))
            s=s+a[i].charAt(j);
        else
            break;
        }      
        p=s;
    }
    return p;
    }
}