//read in the command line argument
int n = Integer.parseInt(args[0]);
// set v to yhe largest power of two that is <=n
int v = 1;
while(v<=n/2){
  v=v*2;
}

//check for precentence of powers of 2 in n, from largest to smallest
while (v >0){
  //v is not present in n
  if (n<v){
    System.out.print(0);
  }
  //v is prese