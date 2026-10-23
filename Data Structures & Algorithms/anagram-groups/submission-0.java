class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map< String, List<String>> groups = new HashMap<>();

        for(int i =0; i<strs.length;i++){
            char[] n = strs[i].toCharArray();
            Arrays.sort(n);
            String key = new String(n);

            List<String> group = groups.getOrDefault(key, new ArrayList<>());
            group.add(strs[i]);
            groups.put(key,group);
        }
        return new ArrayList<>(groups.values());
    }
}
