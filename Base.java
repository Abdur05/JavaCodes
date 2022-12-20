// program to demonstrate single level inheritance
class Base{
  private int a;
  int b;
  protected intc;
  public int d;
  void geta(int x)
   {
    a=x; 
   }
  void getbcd(int x,int y,intz)
   {  
     b=x;
     c=y;
     d=z;
    }
  void puta()
   {
    System.out.println("a ="+a);
    }
  void putbcd()
   {
    System.out.println("b= "+b);
    System.out.println("c= "+c);
    System.out.println("d= "+d);
    }
class Derived extends Base{
  int e,f;
  void getef(int x,int y)
   {
     e=x;
     f=y;
   }
  void putef()
   {
     System.out.println("e="+e);
     System.out.println("f= "+f);
    }
  void showall()
    {
