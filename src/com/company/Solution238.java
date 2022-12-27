class Solution {
    public int numIslands(char[][] grid) {
        int answer=0;
        int m=grid.length;
        int n=grid[0].length;

        for(int currentRow =0 ;currentRow< m;currentRow++){
            for(int currentCol=0;currentCol<n;currentCol++){
                if(grid[currentRow][currentCol]=='1'){
                    List<List<Integer>> cc= new ArrayList<>();
                    sinkIslandGrid(grid,currentRow,currentCol,m,n,cc);
                    System.out.println(cc);
                    answer+=1;
                }
            }
        }
        return answer;
    }

    private void sinkIslandGrid(char[][] grid ,int currentRow,int currentCol,int m,int n,List<List<Integer>> cc){
        if(currentRow <0 || currentRow>=m || currentCol<0 || currentCol>=n || grid[currentRow][currentCol]=='0')
            return;
        
        List<Integer>currentCell= new ArrayList<>();
        currentCell.add(currentRow);
        currentCell.add(currentCol);
        cc.add(currentCell);

        grid[currentRow][currentCol]='0';
        sinkIslandGrid(grid,currentRow-1,currentCol,m,n,cc);
        sinkIslandGrid(grid,currentRow+1,currentCol,m,n,cc);
        sinkIslandGrid(grid,currentRow,currentCol-1,m,n,cc);
        sinkIslandGrid(grid,currentRow,currentCol+1,m,n,cc);

        return;

    }
}
