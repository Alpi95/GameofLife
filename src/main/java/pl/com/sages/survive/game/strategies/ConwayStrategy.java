package pl.com.sages.survive.game.strategies;

/**
 * Regu³a przetrwania: Conway 23/3
 * @author acacko
 *
 */
public class ConwayStrategy extends SurviceStrategy {

	@Override
	protected boolean decideIfKill(int count) { // rozpatrujemy ¿yw¹ komórkê
		if(count < 2 || count > 3) {
			return true;
		} 
		
		return false;
		
	}

	@Override
	protected boolean decideIfBear(int count) { // rozpatrujemy martw¹ komórkê
		if(count == 3) {
			return true;
		}
		
		return false;
	}

}
