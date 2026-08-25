class Solution {
    public int evalRPN(String[] tokens) {
        List<String> l = new ArrayList<>(Arrays.asList(tokens));
        for (int i=2;i<l.size();i++)
            if (!Character.isDigit(l.get(i).charAt(0)))
            {

                if(l.get(i).equals("+"))
                {
                    int a=Integer.valueOf(l.get(i-2)),b=Integer.valueOf(l.get(i-1));
                    l.set(i-2,Integer.toString(a+b));
                    l.remove(i-1);
                    l.remove(i-1);
                    i=i-2;
                }
                else  if(l.get(i).equals("-"))
                {
                    int a=Integer.valueOf(l.get(i-2)),b=Integer.valueOf(l.get(i-1));
                    l.set(i-2,Integer.toString(a-b));
                    l.remove(i-1);
                    l.remove(i-1);
                    i=i-2;
                }
                else  if(l.get(i).equals("*"))
                {
                    int a=Integer.valueOf(l.get(i-2)),b=Integer.valueOf(l.get(i-1));
                    l.set(i-2,Integer.toString(a*b));
                    l.remove(i-1);
                    l.remove(i-1);
                    i=i-2;
                }
                else  if(l.get(i).equals("/"))
                {
                    int a=Integer.valueOf(l.get(i-2)),b=Integer.valueOf(l.get(i-1));
                    l.set(i-2,Integer.toString(a/b));
                    l.remove(i-1);
                    l.remove(i-1);
                    i=i-2;
                }
            }
            
            return Integer.valueOf(l.get(0));

    }
}