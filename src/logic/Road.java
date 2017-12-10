package logic;

public class Road
{
	private final int roadLength;
	public final City city1;
	public final City city2;
	
	public Road(int roadLength, City city1, City city2)
	{
		this.roadLength = roadLength;
		this.city1 = city1;
		this.city2 = city2;
	}
	
	public int getLength()
	{
		return this.roadLength;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(!(o instanceof Road))
		{
			return false;
		}
		Road r = (Road) o;
		if(r.city1 == this.city1)
		{
			if(r.city2 == this.city2) return true;
		}
		else if(r.city1 == this.city2)
		{
			if(r.city2 == this.city1) return true;
		}
		return false;
	}
	
	@Override
	public int hashCode()
	{
		int code = 0;
		code += city1.getIndex();
		code *= 10000;
		code += city2.getIndex();
		return code;
	}
}