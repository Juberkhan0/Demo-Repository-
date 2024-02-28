package Samples;

class first extends Thread
{

  public void  run()
  {
  int i =0;
  while(i<=50){
    System.out.println(i+"First class is running");
    i++;
    }
  }
}
class second extends Thread
{
public   void  run()
  {
  int i =0;
  while(i<=50){
    System.out.println("Second class is running ");
    i++;
    }
  }
}
public class test2 
{

  public static void main(String[] args) 
  {
  first f = new first ();
  second s = new second ();
  f.start();
  s.start();
  }
}
