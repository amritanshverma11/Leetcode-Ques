class Solution {
    public int calPoints(String[] operations) {
        int pp=0,p=0,a=0;
        for(int i=0;i<operations.length;i++)
            if (operations[i].equals("C"))
            {operations[i]=" ";
            int ii=i-1;
            while(operations[ii].equals(" "))
            ii--;
            if(ii>-1)
            operations[ii]=" ";

            }

        for(String s:operations)
        {
            if(Character.isDigit(s.charAt(s.length()-1)))
            {
                pp=p;
                p=Integer.parseInt(s);
                a+=p;
            }
            else if(s.equals("+"))
                {
                    int t=pp;
                    pp=p;
                    p=p+t;
                    a+=p;
                    }
            else if(s.equals("D"))
            {
                pp=p;
                p=p*2;
                a+=p;
            }
        }
        return a;
    }
}