class Solution {
    public int divide(int did, int di)
     {
        long dd=did;
        long d=di;

        boolean n =(dd<0)!=(d<0);
        if(dd== Integer.MIN_VALUE&&d==-1)
        return Integer.MAX_VALUE;
        d=(d<0)?-d:d;
        dd=(dd<0)?-dd:dd;
        int dtd=(int)dd;
         if(d==1)return n?-dtd:dtd;
            int m=0;
            while (dd >= d) {
                long temp = d;
               long multiple = 1;

                       while (dd >= temp + temp) {
                        temp += temp;
                            multiple += multiple;
                              }

              dd -= temp;
               m += multiple;
                }
      
      return n?-m:m;
    }
}