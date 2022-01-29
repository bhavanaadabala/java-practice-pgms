package bhavana;
abstract class mobile
	{
		abstract void cost();
		abstract void ram();
		  {
			System.out.println("mobile has ram");
		  }
	}
class oppo extends mobile
{
 public void cost()
	{
		System.out.println("oppo cost is 23,000");
	}
 public void ram()
	{
		System.out.println("oppo ram is 6GB");
	}
}
class redmi extends mobile
{
 public void cost()
	{
		System.out.println("redmi cost is 20,000");
	}
 public void ram()
	{
		System.out.println("oppo ram is 5GB");
	}
}
public class Abstract
{
 public static void main(String[] args)
  {
	mobile m;
	m=new oppo();
	m.cost();
	m.ram();
	m=new redmi();
	m.cost();
	m.ram();
  }
}