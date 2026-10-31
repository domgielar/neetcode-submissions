class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Character>> rows = new ArrayList<>();
        List<Set<Character>> col = new ArrayList<>();
        List<Set<Character>> box = new ArrayList<>();
        for(int k =0; k<9;k++){
            rows.add(new HashSet<>());
            col.add(new HashSet<>());
            box.add(new HashSet<>());
        }

        for(int i =0; i<9;i++){
            for(int j = 0;j<9;j++){
                char n = board[i][j];
                if(n=='.'){
                    continue;
                }
                int b = (i/3)*3+(j/3);
              if(rows.get(i).contains(n)||box.get(b).contains(n)||col.get(j).contains(n)){
                return false;
              }
              rows.get(i).add(n);
              col.get(j).add(n);
              box.get(b).add(n);
            }
        }
        return true;
    }
}
