public class Average {
//computes the average of numbers
  
  public static void main (String[] args){
    int sum = 0;
    int sum2 = 0;
    int number=Integer.parseInt(args[0]);
    double average;
    double average2;
    for (int i=1; i<=number; i++){
      sum=sum+i;
      sum2=sum*sum;
      System.out.println (i+"   "+ i*i);
    }
    average= (double) sum/number;
    average2= (double) sum2/number;
    System.out.println("sum=" +sum+ " Average=" +average+ " sum2= " + sum2 +" average2= " +average2);
  }
}