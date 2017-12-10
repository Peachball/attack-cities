package states;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MainMenu extends BasicGameState
{

	public MainMenu()
	{
		super();
	}
	
	@Override
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException
	{
		
	}

	@Override
	public void render(GameContainer arg0, StateBasedGame sbg, Graphics arg2) throws SlickException
	{
		
	}

	@Override
	public void update(GameContainer container, StateBasedGame sbg, int arg2) throws SlickException
	{
		if(container.getInput().isKeyPressed(Input.MOUSE_LEFT_BUTTON))
		{
			// sbg.enterState(0, leave, enter);
		}
	}

	@Override
	public int getID()
	{
		return 0;
	}
}