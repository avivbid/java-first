public class Shufflecount{
  public static void main(String[] args){
    int n=Integer.parseInt(args[0]);
    boolean[]visited=new boolean[n]; //??? ?????? ?? ????? ?- N-1 ?? ? 0
    int cnt=0; //???? ??????? ???????
    int valcnt=0; //???? ??????? ?????? ???????
    while(valcnt<n){
      cnt++;
      int number=(int)Math.random()*n;
      if(/*!=not*/!visited[number]){
        visited[number]=true;
        valcnt++;
      }
      System.out.print(cnt);
    }
  }
}