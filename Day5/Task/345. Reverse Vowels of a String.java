class Solution {
    boolean isVowel(char c) {
    return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
           c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
}
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
      String str="aeiouAEIOU";
      int i=0;
      int j=s.length()-1;
      
      while(i<j){
        if(!isVowel(sb.charAt(i))) i++;
        else if(!isVowel(sb.charAt(j))) j--;
        else {

            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;

      }
      }
      return sb.toString();
      }  
    }
