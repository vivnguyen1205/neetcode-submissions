class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for(int r = 0; r<rows;r++){
            for(int c = 0; c<cols;c++){
                if(grid[r][c]== '1'){
                    count++;
                    bfs(grid, r,c);
                }
            }
        }
        return count;

        
    }
    public void bfs(char[][] grid, int r, int c ){
        if(r<0|| r>=grid.length|| c<0||c>=grid[0].length || grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';
        bfs(grid, r-1, c ); // up 
        bfs(grid, r+1, c );// down
        bfs(grid, r, c+1 );//right 
        bfs(grid, r, c-1 );//left
        
    }
}
