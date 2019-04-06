public class Harmonic{
  public static void main (String[] args){
    int n = Integer.parseInt(args [0]);
    double sum = 0;
    for(int i =1; i<=n; i++){
      sum=sum +1.0/i;
      /*sum+=1.0/i;*/
    }
    System.out.println(n+" "+sum);
  }
}