class Solution {
    public int compress(char[] c) 
    {
        if (c.length==1)return 1;
        char a=c[0];
        int k=1,l=0;
        for(int i=1;i<c.length;i++)
        {
            if(c[i]==a)
            k++;
            else 
            {    c[l++]=a;           
                if(k!=1)
                {
                    if(k>9)
                    {
                        String s=Integer.toString(k);
                        for(int ii=0;ii<s.length();ii++)
                         c[l++]=s.charAt(ii);
                    }
                    else 
                    c[l++]=(char)(k+48);
                    k=1;
                }
                a=c[i];
            }
        }
        c[l++]=a;           
         if(k!=1)
         {
             if(k>9)
             {
                 String s=Integer.toString(k);
                 for(int ii=0;ii<s.length();ii++)
                  c[l++]=s.charAt(ii);
             }
             else 
             c[l++]=(char)(k+48);
             k=1;
         }
        return l;
    }
}