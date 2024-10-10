class Solution {
    public String decodeAtIndex(String s, int k) {
        char[] ch=s.toCharArray();
        long decodedL=0;
        for(char c:ch)
        {
            if(Character.isDigit(c))
            {
                decodedL*=(c-'0');
            }
            else
            {
                decodedL++;
            }
        }

        int i,l=s.length();

        for(i=l-1;i>=0;i--)
        {
            char curr=s.charAt(i);

            if(Character.isDigit(curr))
            {
                decodedL/=(curr-'0');
                k%=decodedL;
            }
            else
            {
                if(k==0||decodedL==k)
                {
                    return String.valueOf(curr);
                }
                decodedL--;
            }
        }

        return "";
    }
}
