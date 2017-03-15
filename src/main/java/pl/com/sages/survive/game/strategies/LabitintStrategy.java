package pl.com.sages.survive.game.strategies;

/**
 * Strategia: 12345/3
 * @author acacko
 *
 */
public class LabitintStrategy extends SurviceStrategy {

	@Override
	protected boolean decideIfKill(int count) {
		if(count == 0 || count > 5){
			return true;
		}
		return false;
	}

	@Override
	protected boolean decideIfBear(int count) {
		if(count == 3){
			return true;
		}
		return false;
	}

}
