class Solution {
    public String convertToBase7(int n) {
        if (n==0)return "0";
       int i=(n<0)?-1:1;
       n=(n<0)?(n*-1):n;
        StringBuilder s= new StringBuilder();
        while (n!=0)
        {
            s.append(n%7);
            n/=7;
        }
    
    return (i==1)?s.reverse().toString():(s.append("-").reverse().toString());
    }
}