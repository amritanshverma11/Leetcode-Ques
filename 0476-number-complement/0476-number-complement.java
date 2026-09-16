class Solution {
    public int findComplement(int n) {
        int a=1;
        while (n>a)
        a=(a<<1)+1;

        return a-n;}
}