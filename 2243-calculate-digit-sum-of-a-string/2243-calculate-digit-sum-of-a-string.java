class Solution {
    public String digitSum(String s, int k) {
        StringBuilder a= new StringBuilder(s);
        while(a.length()>k)
        {
            StringBuilder b= new StringBuilder();
            int j=0,f=0;
            for(int i=0;i<a.length();i++)
            {
                char c =a.charAt(i);
                j+=c-'0';
                f++;
                if((i+1)%k==0)
                {
                    b.append(Integer.toString(j));
                    j=0;
                    f=0;
                }
            }
            if(f!=0)
            b.append(Integer.toString(j));
            a=b;
        }
        return a.toString();
    }
}