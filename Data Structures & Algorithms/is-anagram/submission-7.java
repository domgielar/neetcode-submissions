class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> t1 = new HashMap<>();
        HashMap<Character, Integer> t2 = new HashMap<>();
        
        for(int i = 0; i<s.length();i++){
            t1.put(t.charAt(i), t1.getOrDefault(t.charAt(i),0)+1);
            t2.put(s.charAt(i), t2.getOrDefault(s.charAt(i),0)+1);
        }
        return t1.equals(t2);

    }
}
