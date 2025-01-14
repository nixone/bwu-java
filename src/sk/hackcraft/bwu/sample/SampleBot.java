package sk.hackcraft.bwu.sample;

import jnibwapi.Player;
import jnibwapi.Unit;
import sk.hackcraft.bwu.AbstractBot;
import sk.hackcraft.bwu.BWU;
import sk.hackcraft.bwu.Bot;
import sk.hackcraft.bwu.Game;
import sk.hackcraft.bwu.Graphics;
import sk.hackcraft.bwu.Vector2D;
import sk.hackcraft.bwu.Vector2DMath;
import sk.hackcraft.bwu.selection.UnitSet;

public class SampleBot extends AbstractBot
{
	static public void main(String[] arguments)
	{
		BWU bwu = new BWU()
		{
			@Override
			protected Bot createBot(Game game)
			{
				return new SampleBot(game);
			}
		};
		
		bwu.start();
	}
	
	public SampleBot(Game game)
	{
		super(game);
	}

	@Override
	public void gameUpdated()
	{
		UnitSet myUnits = game.getMyUnits();

		for (Unit unit : myUnits)
		{
			if (unit.isIdle() || unit.isStuck())
			{
				// generate new position
				Vector2D position = Vector2DMath.randomVector().scale(game.getMap());
				// attack move!
				unit.attack(position);
			}
		}
	}

	@Override
	public void gameStarted() {}

	@Override
	public void gameEnded(boolean isWinner) {}

	@Override
	public void keyPressed(int keyCode) {}

	@Override
	public void playerLeft(Player player) {}

	@Override
	public void playerDropped(Player player) {}

	@Override
	public void nukeDetected(Vector2D target) {}

	@Override
	public void unitDiscovered(Unit unit) {}

	@Override
	public void unitDestroyed(Unit unit) {}

	@Override
	public void unitEvaded(Unit unit) {}

	@Override
	public void unitCreated(Unit unit) {}

	@Override
	public void unitCompleted(Unit unit) {}

	@Override
	public void unitMorphed(Unit unit) {}

	@Override
	public void unitShowed(Unit unit) {}

	@Override
	public void unitHid(Unit unit) {}

	@Override
	public void unitRenegaded(Unit unit) {}

	@Override
	public void draw(Graphics graphics) {}

	@Override
	public void messageSent(String message) {}

	@Override
	public void messageReceived(String message) {}

	@Override
	public void gameSaved(String gameName) {}
}
