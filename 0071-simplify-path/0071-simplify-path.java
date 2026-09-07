class Solution {
    public String simplifyPath(String p) {
         String s[]=p.split("/");
         for(int i =0;i<s.length;i++)
         {
            if (s[i].equals("."))
            s[i]="";
            if (s[i].equals(".."))
            {
                int j=i-1;
                 while(j>=0&&s[j].equals(""))
                 j--;
                 if (j>-1)
                 s[j]="";
                 s[i]="";

            }
         }
          String a="";
            
         for (int ii =0;ii<s.length;ii++)
            if (s[ii].equals(""))
            continue;
            else a+="/"+s[ii];
            if (a=="")return "/";
            return a;
    }
}