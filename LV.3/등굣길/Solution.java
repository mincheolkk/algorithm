class Solution {
    public int solution(int col, int row, int[][] puddles) {
        int[][] answer = new int[col+1][row+1];

	      boolean[][] block = new boolean[col+1][row+1];
	
        for (int i=0; i<puddles.length; i++){
		        int temp_row = puddles[i][1];
		        int temp_col = puddles[i][0];
    		    block[temp_col][temp_row] = true;
	      }

        for (int i=1; i<=col; i++) {
          for (int j=1; j<=row; j++) {
              if (block[i][j]) {
                  answer[i][j] = 0;
                  continue;
              }

              if (i == 1) {
                 if (j == 1) {
                      answer[i][j] = 1;
                      continue;
                 } else {
                      answer[i][j] = answer[i][j-1];
                 }
              } else if (j == 1) {
                    answer[i][j] = answer[i-1][j];
                    continue;
              } 
              answer[i][j] = (answer[i][j-1] + answer[i-1][j])%1000000007;
            }
          }
      return answer[col][row];
      }
  }
