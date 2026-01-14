/********
  You are given an m x n 2-D integer array matrix and an integer target.

Each row in matrix is sorted in non-decreasing order.
The first integer of every row is greater than the last integer of the previous row.
Return true if target exists within matrix or false otherwise.

Can you write a solution that runs in O(log(m * n)) time?

Example 1:



Input: matrix = [[1,2,4,8],[10,11,12,13],[14,20,30,40]], target = 10

Output: true
Example 2:



Input: matrix = [[1,2,4,8],[10,11,12,13],[14,20,30,40]], target = 15
  **************/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int searchRow = -1;
        for(int i=0;i<matrix.length;i++){
            int columnLength = matrix[i].length;
            //System.out.println("1st pass "+ matrix[i][columnLength-1] + "target "+target);
            if(target<=matrix[i][columnLength-1]){
                //we found the row
                searchRow = i;
                
                //System.out.println("we found the row");
                break;
            }
        }
        if(searchRow == -1)
          return false; // could not assign any row
        //System.out.println("searchRow "+searchRow);
        int start=0;
        int end = start+matrix[searchRow].length-1;
        //System.out.println("start "+start + "end "+end);
        int mid;
        while(start<=end){
            mid = start + (end-start)/2;
            //System.out.println("mid "+mid);
            if(matrix[searchRow][mid]==target){
                return true;
            }
            if(matrix[searchRow][mid]<target){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return false;
    }
}

Output: false
