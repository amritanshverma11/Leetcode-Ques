class Solution {
    public List<String> stringMatching(String[] w) {
        ArrayList <String>l=new ArrayList<>();
        for ( int i=0;i< w.length;i++)
        {
            for (int j=0;j<w.length;j++)
            {
                if(i==j)continue;
                if (w[j].indexOf(w[i])!=-1)
                {l.add(w[i]);
                break;}
            }
        }
        return l;
    }
}