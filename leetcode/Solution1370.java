public class Solution1370 {
    public String sortString(String s) {
        int[] chars = new int[26];
        for(int i=0; i<s.length();i++)
            chars[s.charAt(i)-'a']++;
        
        char[] result = new char[s.length()];
        int count = 0;
        while(count<s.length()){
            for(int i=0; i<chars.length; i++){
                if(chars[i]>0){
                    result[count++] = (char)('a'+i);
                    chars[i]--;
                }
            }
            for(int i=chars.length-1; i>=0;i--){
                if(chars[i]>0){
                    result[count++] = (char)('a'+i);
                    chars[i]--;
                }
            }
        }
        return new String(result);
    }
}