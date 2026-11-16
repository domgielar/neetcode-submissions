class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character, Integer> t1 = new HashMap<>();
        Map<Character, Integer> t2 = new HashMap<>();
        for(int i = 0; i<s.length();i++){
            t1.put(s.charAt(i), t1.getOrDefault(s.charAt(i),0)+1);
            t2.put(t.charAt(i), t2.getOrDefault(t.charAt(i),0)+1);
        }
        return t1.equals(t2);
}
}