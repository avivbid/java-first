public class MaxMax{
  public static void main (String [] args){
int[] a=new int[7];
for(int i=0;i<=(7-1);i++){
  double r=Math.random()*100;
  a[i]=(int) r;
}
//determine max
int max=0;
for(int i=0;i<=(7-1);i++){
  if (a[i]>max ) max=a[i];
}
    //print array+max
    for (int i=0; i<=(7-1);i++){
    System.out.println(a[i]);
  }
  System.out.println("the maximum is: " +max);
  }
}
