class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,Set> column = new HashMap<>();
        Map<Integer,Set> row = new HashMap<>();
        Map<List<Integer>,Set> squares = new HashMap<>();

        for(int i=0;i<9;i++){
            column.put(i,new HashSet<>());
            row.put(i,new HashSet<>());
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                squares.put(Arrays.asList(i,j), new HashSet<>());
            }
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.') continue;
                int d = board[i][j] - '0';
                if(!column.get(i).add(d)) return false;
                if(!row.get(j).add(d)) return false;
                if(!squares.get(Arrays.asList(i/3,j/3)).add(d)) return false;
            }
        }

        return true;
    }
}
