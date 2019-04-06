//program description
public class Max {
  public static void main(String[] args) {
    //determine array size
      int size=Integer.parseInt(args[0]);
    //load array
      int[] a=new int[size];
    for(int i=0;i<=(size-1);i++){
      double r=Math.random()*100;
      a[i]=(int) r;
    }
    //print array
      for(int i=0; i<=(size-1);i++){
      System.out.println(a[i]);
    }
  }
}