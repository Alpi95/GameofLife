package pl.com.sages.survive.game.strategies;

/**
 * Regu�a przetrwania: Conway 23/3
 * @author acacko
 *
 */
public class ConwayStrategy extends SurviceStrategy {

	@Override
	protected boolean decideIfKill(int count) { // rozpatrujemy �yw� kom�rk�
		if(count < 2 || count > 3) {
			return true;
		} 
		
		return false;
		
	}

	@Override
	protected boolean decideIfBear(int count) { // rozpatrujemy martw� kom�rk�
		if(count == 3) {
			return true;
		}
		
		return false;
	}

}
