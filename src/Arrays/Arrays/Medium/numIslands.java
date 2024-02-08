package Arrays.Arrays.Medium;

public class numIslands {
    public static void main(String[] args) {

    }

    public int numIslands(char[][] gird) {
        if (gird == null || gird.length == 0) {
            return 0;
        }
        int count=0;
       int m=gird.length;
        int n=gird[0].length;
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(gird[i][j]=='1'){
                    dfs(gird,i,j);
                    count++;
                }
            }
        }
        return count;

    }
    private void dfs(char[][] gird, int i , int j){
        int m= gird.length;
        int n= gird[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n || gird[i][j] == '0') {
            return;
        }
        gird[i][j]='0';
        dfs(gird,i+1,j);
        dfs(gird,i-1,j);
        dfs(gird,i,j+1);
        dfs(gird,i,j-1);
    }
}
