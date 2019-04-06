public class Histogram{
  public static void main (String[] args){
    int[]histogram= new int[10];
    int n= Integer.parseInt(args[0]);
    while (n>0){
     int i=n%10;
     histogram[i]++;
     n=n/10;
    }
    for(int i=0; i<10; i++){
     System.out.println(i+":");
     for(int j=0;j<histogram[i];j++)
       System.out.print("*");
     }
     System.out.println();
    }
  }