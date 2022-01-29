package bhavana;
interface animals
	{
	 void lifespan();
	 void breath();
    }
abstract class aquaticanimals implements animals
{
  public void animalinwater() 
	{
		System.out.println("aquatic animals lives in water");
	}

}
abstract class wildanimals implements animals
{
 public void animalinforest() 
	{
		System.out.println("wild animals lives in forest");
	}
}
class fish extends aquaticanimals
{
 public void lifespan() 
	{
		System.out.println("fish lifespan was 2-5 yrs");
	}
 public void breath() 
	{
		System.out.println("fish takes oxygen");
	}
}
class crocodile extends aquaticanimals
{
 public void lifespan() 
	{
		System.out.println("crocodile lifespan was 50-60 yrs");
	}

 public void breath() 
	{
		System.out.println("crocodile takes oxygen");
	}
}
class lion extends wildanimals
{
 public void lifespan() 
	{
		System.out.println("lion lifespan was 10-15 yrs");
	}
 public void breath() 
	{
		System.out.println("lion takes oxygen");
	}
	
}
class elephant extends wildanimals
{
 public void lifespan() 
	{
		System.out.println("elephant lifespan was 48 yrs");
	}
 public void breath() 
	{
		System.out.println("elephant takes oxygen");
	}
}
class aquaticanimalsfactory
{
	aquaticanimals aquaticanimals(String acanimals) 
	{
		if(acanimals.equals("fish"))
			return new fish();
		if(acanimals.equals("crocodile"))
			return new crocodile();
		return null;
	}
}
class wildanimalsfactory
{
	wildanimals wildanimals(String wanimals) 
	{
		if(wanimals.equals("lion"))
			return new lion();
		if(wanimals.equals("elephant"))
			return new elephant();
		return null;
	}
}
public class Interfacedemo
{
	public static void main(String[] args) 
	{
	    fish f=new fish();
		f.lifespan();
		f.breath();
		f.animalinwater();
		System.out.println("\n");
		crocodile c=new crocodile();
		c.lifespan();
		c.breath();
		c.animalinwater();
		System.out.println("\n");
		lion l=new lion();
		l.lifespan();
		l.breath();
		l.animalinforest();
		System.out.println("\n");
		elephant e=new elephant();
		e.lifespan();
		e.breath();
		e.animalinforest();
	}
}
