//the program will show the numbers which sum up to the number the user feed
public class SumIsNum{
  public static void main (String []args){
    //get a number from user
    int object= Integer.parseInt(args[0]);
    //create an assistant
    int chain=0;
    //the algorithem
    for(int i=0;i<object;i++){
      chain=object-i;
      System.out.print(chain*10+i+",");
    }
  }
}