class Solution {

    public String encode(List<String> strs) {
        StringBuilder temp = new StringBuilder();
        for(String p : strs){
            temp.append(p.length());
            temp.append('#');
            temp.append(p);
        }
        return temp.toString();
    }

    public List<String> decode(String str) {
        List<String> n = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1, j+len+1);
            n.add(word);
            i= j+len+1;
        }
        return n;
    }
}
