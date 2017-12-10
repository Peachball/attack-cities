package logic;
import java.util.List;
import java.util.Map;

public class City
{
	public int x;
	public int y;

	private Road[] connections;
	public int troopsStationed;
	private Player owner;
	private String upgrade; //"none", "fort", factory", "artillery"
	private Map<City, List<Road>> shortestPaths;
	public String cityName;
	private final int cityIndex;

	public boolean isAttacked;

	public City(int cityIndex, int x, int y)
	{
		this.cityIndex = cityIndex;
	}

	//this logic will be hard
	public void getAttacked(int troopsAttacking)
	{

	}

	//every tick, get more troops stationed
	private void generateTroops()
	{
		if(upgrade.equals("factory")) 
		{
			troopsStationed += 3;
		}
		else
		{
			troopsStationed += 1;
		}
	}

	//when conquered, change the owner
	private void changeOwner(Player attacker)
	{
		owner = attacker;
	}

	/*
		@Override
		public boolean equals(Object o)
		{
			if(!(o instanceof City)) {
				return false;
			}
			City c = (City) o;
			if(c)
		}

		@Override
		public int hashCode()
		{

		}
	 */

	public Road[] getConnections()
	{
		return connections;
	}

	public int getIndex()
	{
		return cityIndex;
	}
}