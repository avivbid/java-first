//the program will create a checker board sized up to the user's request
public class CheckerBoard{
  public static void main (String []args){
    //get a number from user
    int Size= Integer.parseInt(args[0]);
    boolean cnt=true;
    for(int i=0;i<Size;i++){
      for(int j=0;j<Size*2;j++){
        if(cnt==true){
          System.out.print("*");
          cnt=false;
        }
        else{
          System.out.print(" ");
        cnt=true;
        }
      }
      System.out.println();
      cnt=!cnt;
    }
  }
}