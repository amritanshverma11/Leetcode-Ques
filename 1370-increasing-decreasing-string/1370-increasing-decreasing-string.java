class Solution {
    public String sortString(String s) {
        int n=s.length();
        int[] freq=new int[26];
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int flag=0;
        while(n>0){
            if(flag==0){
                for(int i=0;i<26;i++){
                    if(freq[i]!=0){
                        freq[i]--;
                        sb.append((char)(i+'a'));
                        n--;
                    }
                }
                flag=1;
            }else{
                for(int i=25;i>=0;i--){
                    if(freq[i]!=0){
                        freq[i]--;
                        sb.append((char)(i+'a'));
                        n--;
                    }
                }
                flag=0;
            }
        }
        return sb.toString();
    }
}