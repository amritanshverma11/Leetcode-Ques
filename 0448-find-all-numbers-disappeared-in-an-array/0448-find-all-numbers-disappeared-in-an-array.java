class Solution {
    public List<Integer> findDisappearedNumbers(int[] n) {
        int [] a =new int [n.length];
        for(int i =0;i<n.length;i++)
        a[i]=0;
        for(int i =0;i<n.length;i++)
        a[n[i]-1]=1;
        ArrayList<Integer> l= new ArrayList<>();int k=1;
        for (int i=0;i<n.length;i++)
        if(a[i]==0)
        l.add(i+1);
        return l;
    }
}