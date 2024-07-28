class Solution {
    public void setZeroes(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
boolean firstRow = false;
        boolean firstCol = false;

        // Check if the first row contains zero
        for (int j = 0; j < n; j++) {
            if (arr[0][j] == 0) {
                firstRow = true;
                break;
            }
        }

        // Check if the first column contains zero
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                firstCol = true;
                break;
            }
        }        
  
        for(int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                if(arr[i][j]==0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        
        
        
        for(int i=1; i<m; i++){
            for(int j =1; j<n; j++){
                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j] = 0;
                }
            }
        }
        
           if (firstRow) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }

        // Set first column to zero if needed
        if (firstCol) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }

    }
}