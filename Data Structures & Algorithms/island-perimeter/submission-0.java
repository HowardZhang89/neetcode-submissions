class Solution {

    Set<String> visited = new HashSet();
    
    public int islandPerimeter(int[][] grid) {
        
        int perimeter = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    return dfs(i,j,grid);
                }
            }
        }
        return perimeter;
    }

    private int dfs(int i, int j, int[][] grid){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return 1;
        }
        String coord = i + "," + j;
        if(this.visited.contains(coord)){
            return 0;
        }
        this.visited.add(coord);
        int perimeter = 0;
        perimeter += dfs(i-1, j, grid);
        perimeter += dfs(i+1, j, grid);
        perimeter += dfs(i, j-1, grid);
        perimeter += dfs(i, j+1, grid);
        return perimeter;
    }
}