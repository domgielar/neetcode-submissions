class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> d = new HashMap<>();
        Map<Character, Integer> d1 = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i = 0; i<s.length();i++){
        d.put(s.charAt(i),d.getOrDefault(s.charAt(i),0)+1);
            d1.put(t.charAt(i),d1.getOrDefault(t.charAt(i),0)+1);
        }
        return d1.equals(d);
    }
}
