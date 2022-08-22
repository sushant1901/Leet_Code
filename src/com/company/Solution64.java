class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2) return true;
        int dx=(coordinates[1][1] - coordinates[0][1]);
        int dy=(coordinates[1][0] - coordinates[0][0]);
        for(int i=2;i<coordinates.length;i++){
            if(dx*(coordinates[i][0] - coordinates[1][0]) != dy*(coordinates[i][1] - coordinates[1][1]))
                return false;
        }
        return true;
        
    }
}
    
