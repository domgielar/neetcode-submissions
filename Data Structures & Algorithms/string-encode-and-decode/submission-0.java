class Solution {

    public String encode(List<String> strs) {
        return String.join(",",strs);
    }

    public List<String> decode(String str) {
        List<String> t = new ArrayList<>();
        String[] ans = str.split(",");
        for(String p: ans){
            t.add(p);
        }
        return t;
    }
}
