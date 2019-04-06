public class SumDigits{
  public static void main(String[]args){
    int num = Integer.parseInt(args[0]);
    int x = num%100;
    int y = num%1000/100;
    int z = num/1000;
    System.out.println("the sum for the number "+num+" is: "+(x+y+z));
  }
}