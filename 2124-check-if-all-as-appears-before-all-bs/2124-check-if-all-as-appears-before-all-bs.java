class Solution {
    public boolean checkString(String s) {
        if(s.lastIndexOf('a')==-1||s.indexOf('b')==-1)return true;
        return s.lastIndexOf('a')<s.indexOf('b');
    }
}