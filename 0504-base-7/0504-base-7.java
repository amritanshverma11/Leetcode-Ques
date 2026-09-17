class Solution {
    public String convertToBase7(int n) {
        if (n==0)return "0";
       int i=(n<0)?-1:1;
       n=(i==1)?n:(n*-1);
        String s="";
        while (n!=0)
        {
            s=Integer.toString(n%7)+s;
            n/=7;
        }
    
    return (i==1)?s:("-"+s);
    }
}