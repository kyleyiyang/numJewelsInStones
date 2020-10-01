class Solution {
    public int numJewelsInStones(String J, String S) {
        int n=0;
        int len = S.length();
        for (int i=0;i<len;i++) {
            if (J.contains(String.valueOf(S.charAt(i)))) {
                n++;
            }
        }
        return n;
    }
}

//Another solution
class Solution {
    public int numJewelsInStones(String J, String S) {
        int n=0;
        char[] chars = S.toCharArray();
        int len = S.length();
        for (int i=0;i<len;i++) {
            if (J.contains(String.valueOf(chars[i]))) {
                n++;
            }
        }
        return n;
    }
}

//Third solution (fastest)
class Solution {
    public int numJewelsInStones(String J, String S) {
        int n=0;
        int len = S.length();
        for (int i=0;i<len;i++) {
            if (J.indexOf((S.charAt(i)))!=-1) {
                n++;
            }
        }
        return n;
    }
}
