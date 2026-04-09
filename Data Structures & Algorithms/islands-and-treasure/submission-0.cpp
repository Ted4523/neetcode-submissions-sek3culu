class Solution {
public:
    int dr[4] = {-1,1,0,0};
    int dc[4] = {0,0,-1,1};
    void islandsAndTreasure(vector<vector<int>>& grid) {
        if(grid.size()==0) return;
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[0].size();j++){
                if(grid[i][j]==0){
                    dfs(grid,i,j);
                }
            }
        }
        return;
    }

    void dfs(vector<vector<int>>& grid, int x, int y){
        int distance = grid[x][y] + 1;
        for(int i=0;i<4;i++){
            int row = x + dr[i];
            int column = y + dc[i];
            if(row>=0 && row<grid.size() && column>=0 && column<grid[0].size() && grid[row][column] > distance){
                grid[row][column] = distance;
                dfs(grid,row,column);
            }
        }
    }
};
