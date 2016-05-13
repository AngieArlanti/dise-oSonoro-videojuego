package model.fighter.opponent;

import model.board.Content;
import model.element.Blood;
import model.fighter.Fighter;
import model.fighter.FighterBase;
import model.fighter.level.LevelEnemy;


public class Snake extends FighterBase{

	private static final double HEALTH=1;
	private static final double STRENGTH=1;
	
	public Snake(int value){
		super(new LevelEnemy(value,HEALTH,STRENGTH));
	}
		
	@Override
	public Content interact(Fighter hero) {
		
		if(super.interact(hero)==null)
			return new Blood();
		else
			return this;
	}
}
