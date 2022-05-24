class Solution {
    public boolean isPalindrome(int x) {
        String intString  = Integer.toString(x);
        String revesed = "";
        char a;
        for(int i = 0; i < intString.length(); i++){
            a= intString.charAt(i); 
            revesed= a+revesed;
        }

        return intString.equals(revesed);
    }
}
