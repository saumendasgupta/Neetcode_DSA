/************
  You are given a 9 x 9 Sudoku board board. A Sudoku board is valid if the following rules are followed:

Each row must contain the digits 1-9 without duplicates.
Each column must contain the digits 1-9 without duplicates.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without duplicates.
Return true if the Sudoku board is valid, otherwise return false

Note: A board does not need to be full or be solvable to be valid.
  ********************/
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet();
        boolean res = true;
        for(int i =0 ;i<9;i++){ //row
            set = new HashSet();
            for(int j=0;j<9;j++){ //column
             if(board[i][j]!='.' && !set.add(board[i][j])){
                 return false;
             }
            }
        }
      for(int j =0 ;j<9;j++){ //column
            set = new HashSet();
            for(int i=0;i<9;i++){ //row
             if(board[i][j]!='.' && !set.add(board[i][j])){
                 return false;
             }
            }
        }
		//box at   (0,0),(0,3),(0,6)
		//         (3,0),(3,3),(3,6)
        //         (6,0),(6,3),(6,6)
		
        for(int boxrow=0;boxrow<9;boxrow+=3){
			for(int boxcol=0;boxcol<9;boxcol+=3){
			    set = new HashSet<>();
				for(int i= boxrow;i<boxrow+3;i++){
					for(int j=boxcol;j<boxcol+3;j++){
						if(board[i][j]!='.' && !set.add(board[i][j])){
							return false;
						}
					}
				}
			}
		}
        
        return true;
    }
}
