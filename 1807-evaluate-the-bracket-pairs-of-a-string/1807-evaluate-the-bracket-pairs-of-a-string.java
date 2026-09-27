class Solution {
    public String evaluate(String ss, List<List<String>> k) {
        StringBuilder s = new StringBuilder(ss);
        HashMap<String ,String> h = new HashMap<>();
        for(int i=0;i<k.size();i++)
        h.put(k.get(i).get(0),k.get(i).get(1));
         int j;
         while ((j=s.indexOf("("))!=-1)
         {
            StringBuilder q= new StringBuilder();
            char c= s.charAt(++j);
            while (c!=')')
            {
                q.append(c);
                 c=s.charAt(++j);
            }
            if (h.containsKey(q.toString()))
            s=s.replace(s.indexOf("("),j+1,h.get(q.toString()));
            else 
            s=s.replace(s.indexOf("("),j+1,"?");
         }
        return s.toString();

    }
}