
import java.util.Map;

public class MapLogic {
	
	//each node is a city
	
	//will have to implement dijkstra sometime
	private class Node {
		private Map<Node, Integer> connections;
		public int troopsStationed;
		private Player owner;
		private String upgrade; //"none", "fort", factory", "artillery"
		
		public Node() {
			
		}
		
		//this logic will be hard
		public void getAttacked(int troopsAttacking) {
			
		}
		
		//every tick, get more troops stationed
		private void generateTroops() {
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
		private void changeOwner(Player attacker) {
			owner = attacker;
		}
	}
	
	public MapLogic() {
		
	}
}
