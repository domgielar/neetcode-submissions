class Solution {
    public boolean isAnagram(String s, String t) {
        Map<String, Integer> d = new HashMap<>();
        Map<String, Integer> d1 = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }

        for(int i = 0; i<d.length();i++){
            d.put(charAt(s[i]),d.getOrDefault(charAt(s[i],0)+1))
        }
    }
}
