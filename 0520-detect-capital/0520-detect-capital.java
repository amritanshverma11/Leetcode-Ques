class Solution {
    public boolean detectCapitalUse(String w) {
        if(Character.isUpperCase(w.charAt(0))){
         for (int i=1;i<w.length()-1;i++)
            if(Character.isUpperCase(w.charAt(i))!=Character.isUpperCase(w.charAt(i+1)))
             return false ;}
         else{
            for (int j=1;j<w.length();j++)
            if(Character.isUpperCase(w.charAt(j)))
             return false ;}
         return true ;
    }
}