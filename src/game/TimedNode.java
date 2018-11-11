package game;

import java.awt.Graphics2D;
import java.util.ArrayList;

import com.zalinius.architecture.IGameObject;
import com.zalinius.utilities.time.GameClock;

public abstract class TimedNode extends Node implements IGameObject {
	
	private double holdTime;
	
	public TimedNode(double holdTime)	
	{
		super();
		this.holdTime = holdTime;
	}
	
	@Override
	public boolean inputItem(Item item)
	{
		if (super.inputItem(item))
		{
			GameClock.addTimer(this, holdTime);
			return true;
		}
		else
		{
			return false;
		}
	}
			
	@Override
	public void update(double delta) {
		if (GameClock.isTimerDone(this))
		{
			outputItem(currentItem);
		}
	}

	@Override
	public void render(Graphics2D g) {	
		
	}
}