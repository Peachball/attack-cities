package states;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Line;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import logic.MapLogic;
import logic.Road;
import logic.City;

public class MapState extends BasicGameState{

	private MapLogic map;
	private Rectangle[] cityShapes;
	private Line[] roadShapes;
	@Override
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		map = new MapLogic("duel");
		cityShapes = new Rectangle[map.cities.length];
		roadShapes = new Line[map.roads.length];
		for(int a = 0; a < cityShapes.length; a++)
		{
			City c = map.cities[a];
			Rectangle shape = new Rectangle(c.x, c.y, 50, 50);
			cityShapes[a] = shape;
		}
		for(int a = 0; a < roadShapes.length; a++)
		{
			Road r = map.roads[a];
			Line l = new Line(r.city1.x, r.city1.y, r.city2.x, r.city2.y);
			roadShapes[a] = l;
		}
	}
	
	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics g) throws SlickException {
		for (Rectangle r : cityShapes)
		{
			g.fill(r);
		}
		for(Line l : roadShapes)
		{
			g.draw(l);
		}
		for(City c : map.cities)
		{
			if(c.isAttacked)
			{
				//find some way around this
				g.drawString(c.troopsStationed, c.x, c.y - 10);
			}
		}
	}

	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int delta) throws SlickException {
		
	}

	@Override
	public int getID() {
		return 0;
	}

}
