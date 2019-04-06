public class Binarry {
  public static void main (String[]args){
    int n = Integer.parseInt(args[0]);
    int v=1;
    while (v<=n/2){
      v*=2;
  }
    while(n>0){
      if(v<=n){
        System.out.print("1");
        n=n-v;
      }
        else{
          System.out.print("0");
        }
       v=v/2;
   }
    }
}