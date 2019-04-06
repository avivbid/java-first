public class Rand{
  public static void main (String[] args){
    double [] r=new double [100];
    double sum=0;
    for(int i=0; i<r.length; i++){
      r[i]=Math.random();
      sum=sum+r[i];
        }
    System.out.println("average is: " + "= " + sum); 
  }
}