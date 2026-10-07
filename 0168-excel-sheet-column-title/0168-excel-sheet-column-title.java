class Solution {
    public String convertToTitle(int n) {
        StringBuilder s= new StringBuilder();
        while(n>0)
        {
            n--;
            s.append((char)(n%26+65));
            n/=26;
        }
        return s.reverse().toString();
    }
}