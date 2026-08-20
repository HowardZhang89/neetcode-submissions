class Solution {
    boolean[][] visited;

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        visited = new boolean[rows][cols];
        int islands = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == '1' && visited[i][j] == false){
                    islands++;
                    dfs(grid,i,j);
                }
            }
        }
        return islands;
    }
    
    private void dfs(char[][] grid, int i, int j){
        // check edges
        if(i < 0 || i >= grid.length 
            || j < 0 || j >= grid[0].length) { 
                return;
        }
        if(grid[i][j] == '0' || visited[i][j] == true) return;
        visited[i][j] = true;
        // visit adjacent land and mark as visited
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
        return;
    }
}
