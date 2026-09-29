class Solution {
    public int dayOfYear(String date) {
        int d=Integer.valueOf(date.substring(8));
        int m=Integer.valueOf(date.substring(5,7));
        int y=Integer.valueOf(date.substring(0,4));
        int a[];
        if (y%400==0||(y%4==0&&y%100!=0))
            a=new int []{0,31,60,91,121,152,182,213,244,274,305,335,366};
        else 
            a=new int []{0,31,59,90,120,151,181,212,243,273,304,334,365};
            return (d+a[m-1]);
        
    }
}