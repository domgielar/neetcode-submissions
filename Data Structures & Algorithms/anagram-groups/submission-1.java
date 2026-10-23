class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> n = new HashMap<>();

        for(int i = 0;i<strs.length;i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);

            List<String> temp2 = n.getOrDefault(key, new ArrayList<>());
            temp2.add(strs[i]);
            n.put(key,temp2);
        }
        return new ArrayList<>(n.values());
    }
}
