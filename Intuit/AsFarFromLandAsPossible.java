https://leetcode.com/problems/as-far-from-land-as-possible/

class Solution {
    
    int dir[][]={{-1,0},{0,1},{1,0},{0,-1}};
    
    public int maxDistance(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int n=grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    q.add(new int[]{i,j});
                }
            }
        }
        if(q.size()==0 || q.size()==n*n) return -1;
        int max=0;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                int cur[]=q.poll();
                for(int i=0;i<4;i++){
                    int nexti=cur[0]+dir[i][0];
                    int nextj=cur[1]+dir[i][1];
                    if(nexti>=0 && nexti<n && nextj>=0 && nextj<n && grid[nexti][nextj]==0){
                        grid[nexti][nextj]=1;
                        q.add(new int[]{nexti,nextj});
                    }
                }
            }
            max++;
        }
        return max-1;
    }
}