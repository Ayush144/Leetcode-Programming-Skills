You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

 

 

Example 1:



Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true
Example 2:



Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
Output: false
 

Constraints:

2 <= coordinates.length <= 1000
coordinates[i].length == 2
-10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
coordinates contains no duplicate point.
=======================================================================================================================================================================
JAVA SOLUTION

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x =coordinates[0][0];
        int y=coordinates[0][1];
         int x1 =coordinates[1][0];
        int y1=coordinates[1][1];
           int diff=x1-x;
          int diffy=y1-y;
        double slope=Integer.MAX_VALUE;
        if(diff!=0){
        slope=(double)diffy/diff;
        }
      
          for(int i=1;i<coordinates.length-1;i++){
              
              int dx=coordinates[i+1][0]-coordinates[i][0];
               int dy=coordinates[i+1][1]-coordinates[i][1];
              double temp=0;
              if(dx!=0){
                temp=(double)dy/dx;
              }
              else{
                  temp=Integer.MAX_VALUE;
              }
             if(temp!=slope){
                    return false;
                }
                 
        }
        return true;
    }
}
