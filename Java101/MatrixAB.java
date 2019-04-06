public class MatrixAB{
  public static void main(String[] args){
    int[][]a=new int[2][2];
    int[][]b=new int[2][2];
    int[][]c=new int[2][2];
    for(int row=0;row<2; row++){ //???? ????? Math.length ????? 2 ??? ????? ?? ???? ??????
      for(int col=0;col<2; col++){
        a[row][col]=row*col;
        b[row][col]=row*col;
      }
    }
    //c=a*b
    for(int row=0;row<2;row++){
      for(int col=0;col<2;col++){
        for(int k=0;k<2;k++){
         c[row][col]=c[row][col]+a[row][k]*b[k][col];
        }
      }
    }
  }
}