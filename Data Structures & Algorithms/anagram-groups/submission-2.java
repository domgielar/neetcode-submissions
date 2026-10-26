class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> group = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            char[] n = strs[i].toCharArray();
            Arrays.sort(n);
            String key = new String(n);

            List<String> groups = group.getOrDefault(key,new ArrayList<>());
            groups.add(strs[i]);
            group.put(key,groups);
        }
        return new ArrayList<>(group.values());
    }
}
