class Solution {
    public List<Integer> busiestServers(int k, int[] a, int[] l) {
        int s[]=new int[k];
        int n[]= new int [k];
        int m=0;
        for(int i=0;i<l.length;i++)
        {
            int x=i%k;
            while(s[x]!=0)
            {
                if(a[i]>=s[x])break;
                x++;
                if(x==k)break;
            }
            if(x==k)
            for(int j=0;j<i%k;j++)
            if(a[i]>=s[j])
            {
                x=j;
                break;
            }
            if(x<k)
            {s[x]=a[i]+l[i];
            n[x]++;
            m=Math.max(m,n[x]);
            }
        }
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            if(n[i]==m)
            li.add(i);
        }
        return li;
    }
}