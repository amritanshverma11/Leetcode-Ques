class Solution {
    public int digitFrequencyScore(int n) {
     String s=Integer.toString(n);int sum=0;
     for (int i=48;i<58;i++)
     {char ii=(char)i;int f=0;
     if(s.indexOf(ii)!=-1)
     for(int j=0;j<s.length();j++)
        if(s.charAt(j)==ii)
        f+=1;
        sum=sum+((i-48)*f);
    }
    return sum;
    }
}