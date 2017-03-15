package pl.com.sages.survive.game.strategies;

public class ServetyStrategy extends SurviceStrategy{

	@Override
	protected boolean decideIfKill(int count) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean decideIfBear(int count) {
		if(count >= 2 && count <= 4){
			return true;
		}
		return false;
	}

}
