class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> n = new HashMap<>();
        for(int i =0; i<strs.length;i++){
            char[] n1 = strs[i].toCharArray();
            Arrays.sort(n1);
            String key = new String(n1);

            if(!n.containsKey(key)){
                n.put(key, new ArrayList<>());
            }

            n.get(key).add(strs[i]);
        }
        return new ArrayList<>(n.values());
    }
}
