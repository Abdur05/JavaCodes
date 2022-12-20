class AnonArray{
   public static void main(String args[]){
     AnonArray.sum(new int[]{1,2,3,4});
     }
   static void sum(int[] no)
     {
      int tot=0;
      for(int i:no)
	{
	 tot=tot+i;
	}
      System.out.println("Sum is : "+tot);
      }
 }