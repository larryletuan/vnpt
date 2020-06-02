package vnpt;

public class MathUtil {
	public static int chia(int sochia, int sobichia)
	{
		if(sochia == 0)
		{
			System.out.println("loi chia cho 0");
			return 0;
		}
		 
		return sobichia/sochia;
	}
   public static int cong(int a,int b)
   {
	   return a+b;
   }
   public static int tru(int a,int b)
   {
	   return a-b;
   }
   public static void main(String [] args)
   {
	   System.out.println("welcome to pipeline!!!");
	   
   }
}
