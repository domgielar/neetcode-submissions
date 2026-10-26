class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character, Integer> d = new HashMap<>();
        Map<Character, Integer> d1 = new HashMap<>();
        for(int i =0;i<s.length();i++){
            d.put(s.charAt(i), d.getOrDefault(s.charAt(i),0)+1);
            d1.put(t.charAt(i), d1.getOrDefault(t.charAt(i),0)+1);
        }
        return d.equals(d1);
}
}