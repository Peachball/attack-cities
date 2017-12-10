
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import states.MainMenu;

import org.newdawn.slick.state.BasicGameState;

public class AttackCities extends StateBasedGame
{
	public AttackCities()
	{
		super("attack cities");
	}
	
	@Override
	public void initStatesList(GameContainer container) throws SlickException
	{
		this.addState(new MainMenu());
		
	}
	
	public static void main(String[] args)
	{
		try 
		{
			AppGameContainer app = new AppGameContainer(new AttackCities());
			app.setDisplayMode(500, 400, false);
			app.setShowFPS(false);
			app.start();
		}
		catch (SlickException e)
		{
			e.printStackTrace();
		}
	}
}
