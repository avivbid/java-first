public class Pythagors{
  public static void main(String[]args){
    int m= Integer.parseInt(args[0]);
    int n= Integer.parseInt(args[1]);
    int x= m*m-n*n;
    int y= 2*m*n;
    int z= m*m+n*n;
    System.out.println("The pythagorian triplet is :"+x+"/"+y+"/"+z);
  }
}
    