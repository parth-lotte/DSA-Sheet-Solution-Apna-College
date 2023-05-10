class Solution {

    public static void dfs(int row,  int col, int delRow[], int delCol[],
    int newColor, int inicolor,int [][] ans, int [][] image)
    {
        // matrix with new color 
        ans[row][col]=newColor;
        // calclutatimng the length 

        int n= image.length;
        int m= image[0].length;

        for(int i=0; i<4; i++)
        {
            int nrow= row+ delRow[i];
            int ncol= col+ delCol[i];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==inicolor && ans[nrow][ncol]!=newColor )
            {
              dfs(nrow,   ncol,  delRow, delCol,
     newColor, inicolor, ans, image);
            }
        }


    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        // First we will create the initial color 
        // i mean intailise the color 

        int inicolor= image[sr][sc];
        // We will create a new matrix for the ans to be stored 

        int ans [][]= image;
        int delRow[]={-1,0,+1,0};
        int delCol[]={0,+1,0,-1};


         dfs(sr,sc,delRow,delCol,color,inicolor,ans,image);
        return ans;

        
    }
}