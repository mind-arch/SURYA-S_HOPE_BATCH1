class Solution {
    public String reverseWords(String s) {
     StringBuilder sb= new StringBuilder();
     String[] str= s.split(" ");
        for(String st: str){
            sb.append(new StringBuilder(st).reverse());
            sb.append(" ");
    
    }
    return sb.toString();
    }
}