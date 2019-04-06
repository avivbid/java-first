public class Box{
  public static void main(String[]args){
    int length= Integer.parseInt(args[0]);
    int height= Integer.parseInt(args[1]);
    int width= Integer.parseInt(args[2]);
    
    System.out.println("Box surface is: "+2*(length*height+height*width+length*width));
    System.out.println("Box volume is: "+2*(length*height+width*height));
                       }
}
                       