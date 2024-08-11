class Snake_In_Matrix {
    public int finalPositionOfSnake(int n, List<String> commands)
    {   
        int i,j,k;
        int[][] grid = new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                grid[i][j] = (i * n) + j;
            }
        }

        i=0;j=0;
            for(k=0;k<commands.size();k++)
            {
                String c = commands.get(k);
                if(c.equals("RIGHT"))
                    j++;
                if(c.equals("LEFT"))
                    j--;
                if(c.equals("UP"))
                    i--;
                if(c.equals("DOWN"))
                    i++;
            }
        
        return grid[i][j];   
    }
}
