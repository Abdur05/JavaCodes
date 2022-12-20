import java.util.*;
class Arm{
  public static void main(String args[]){
    int i,n,sum=0,c,d,temp,res=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the limit");
    n=sc.nextInt();
    for(i=100;i<=n;i++)
     {
      c=0;
      temp=n;
      while(temp>0)
       {c++;
        temp=temp/10;}
      temp=i;
      while(temp>0)
       {
         d=temp%10;
	 sum+=(int) Math.pow(d,c);
	 temp=temp/10;
        }
     if(i==sum)
      {res=res+sum;} 
  
}
System.out.println("Sum of arm ="+sum);
}
} 
