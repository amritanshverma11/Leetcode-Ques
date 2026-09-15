class Solution {
    public List<String> letterCombinations(String d) {
        ArrayList<String> l= new ArrayList<>();
        
        String s[][]= {{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
        for (int j=0;j<s[(d.charAt(0)-'0')-2].length;j++)
        l.add(s[(d.charAt(0)-'0')-2][j]);
        
        for (int i=1;i<d.length();i++)
        {
            int x=(d.charAt(i)-'0')-2;
            for (int k=0;k<l.size();k++)
            {
                if(s[x].length==3)
               { 
                String  a=l.get(k);
                l.set(k,a+s[x][0]);
                l.add(k,a+s[x][1]);
                l.add(k,a+s[x][2]);
                k+=2;
               }
               else
                {
                    String aa=l.get(k);
                l.set(k,aa+s[x][0]);
                l.add(k,aa+s[x][1]);
                l.add(k,aa+s[x][2]);
                l.add(k,aa+s[x][3]);
                k+=3;
                }
            }
            
        }
        return l;

    }
}