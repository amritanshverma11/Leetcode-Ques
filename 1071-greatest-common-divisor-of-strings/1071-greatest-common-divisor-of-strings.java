class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if("".equals(str1)) return str2;
        if(str1.length()<str2.length()){
            return gcdOfStrings(str2,str1);
        }
        int n = str2.length();
        for(int i=0; i<n; i++){
            if(str2.charAt(i)!=str1.charAt(i)){
                return "";
            }
        }
        return gcdOfStrings(str1.substring(n),str2);
    }
}