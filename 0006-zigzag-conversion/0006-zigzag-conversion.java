class Solution {
    public String convert(String s, int n) {
        if(n==1)return s;
        StringBuilder a[]= new StringBuilder[n];
        StringBuilder b= new StringBuilder();
        for(int i=0;i<n;i++)
        a[i]=new StringBuilder();
         boolean q=false;
         int x=0;
         for(int i=0;i<s.length();i++){
             a[x].append(s.charAt(i));
            if(x==0||x==n-1){
                q=x==0?true:false;
            }
            x+=q==true?1:-1;
        }
         for(int j=0;j<n;j++)
        b.append(a[j]);
        return b.toString();
    }
}