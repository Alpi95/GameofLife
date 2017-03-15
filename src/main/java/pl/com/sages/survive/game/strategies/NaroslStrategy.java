package pl.com.sages.survive.game.strategies;

public class NaroslStrategy extends SurviceStrategy{

	@Override
	protected boolean decideIfKill(int count) {
		if(count == 1){
			return true;
		}
		return false;
	}

	@Override
	protected boolean decideIfBear(int count) {
		if(count == 1){
			return true;
		}
		return false;
	}

}
