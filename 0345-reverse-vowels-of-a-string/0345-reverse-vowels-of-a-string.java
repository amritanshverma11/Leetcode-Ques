class Solution {
    public boolean v(char a)
    {
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')return true;
        return false ;
    }
    public String reverseVowels(String s) {
        int l=0,r=s.length()-1;
        while(l<r)
        {
            while(!(v(s.charAt(l)))&&(l<r))l++;
            while(!(v(s.charAt(r)))&&(l<r))r--;
            if((l<r))
            if (v(s.charAt(l))&&v(s.charAt(r))){

            if(l==0&&r==s.length()-1)
            s=s.charAt(r)+s.substring(l+1,r)+s.charAt(l);
            else if(l!=0&&r==s.length()-1)
            s=s.substring(0,l)+s.charAt(r)+s.substring(l+1,r)+s.charAt(l);
           else if(l==0&&r!=s.length()-1)
            s=s.charAt(r)+s.substring(l+1,r)+s.charAt(l)+s.substring(r+1);
            else if(l!=0&&r!=s.length()-1)
            s=s.substring(0,l)+s.charAt(r)+s.substring(l+1,r)+s.charAt(l)+s.substring(r+1);
            }l++;r--;
            
        }return s;
        
    }
}