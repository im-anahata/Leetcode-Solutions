class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int i ,j,m,n,a,b;
        int [] []arr = new int [r][c];
        m= mat.length;
        n= mat[0].length;
        a=0;
        b=0;
        if ((m*n)!= r*c)
            return mat;
        else{
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(b==c){
                    a++;
                    b=0;
                }
                arr[a][b]= mat[i][j];
                    b++;

            }
            
            
        }
        return arr;
    }
}
}