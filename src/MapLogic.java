
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class MapLogic {
	
	//each node is a city
	static City [] cities;
	
	//what am i doing
	
	//will have to implement dijkstra sometime
	
	
	public MapLogic(String mapName) {
		cities = new City [0];
	}
	
	private static Map<City, List<Road>> Dijkstra(City start) {
		PriorityQueue<Road> pq = new PriorityQueue<Road>(
			new Comparator<Road>() {
				@Override
				public int compare(Road r1, Road r2) {
					if(r1.getLength() > r2.getLength())
						return 1;
					else if(r1.getLength() == r2.getLength())
						return 0;
					else return -1;
				}
			}
		);
		for(Road c : start.getConnections())
		{
			pq.add(c);
		}
		Map<City, Integer> dists = new HashMap<City, Integer> ();
		Map<City, List<Road>> ret = new HashMap<City, List<Road>>();
		Set<Integer> visited = new HashSet<Integer>();
		for(City c : cities) 
		{
			dists.put(c, Integer.MAX_VALUE);
		}
		dists.put(start, 0);
		while(!pq.isEmpty())
		{
			Road r = pq.remove();
			City curr = r.city1;
			City prev;
			if(visited.contains(curr.getIndex()))
			{
				prev = r.city1;
				curr = r.city2;
				if(visited.contains(curr.getIndex()))
				{
					continue;
				}
			}
			else
			{
				prev = r.city2;
			}
			
			for(Road nextRoad : curr.getConnections())
			{
				if(!pq.contains(nextRoad))
				{
					pq.add(nextRoad);
				}
			}
			
			dists.put(curr, r.getLength());
			List<Road> prevPath = ret.get(prev);
			visited.add(curr.getIndex());
			
		}
		return ret;
		
	}
	
	
}
