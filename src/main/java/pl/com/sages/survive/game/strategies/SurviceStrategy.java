package pl.com.sages.survive.game.strategies;

import pl.com.sages.survive.game.Table;

public abstract class SurviceStrategy implements Survive {

	@Override
	public Table makeMove(Table table){
		
		Table newStep = new Table(table);
		
		for (int i = 0; i < table.getXLenght(); i++) {
			for (int j = 0; j < table.getYLenght(); j++) {
				int count = countNeighbors(i, j, table);
				if(table.isAlive(i, j)){ // rozpatrujemy s¹siedztwo ¿ywej komórki
					boolean kill = decideIfKill(count);
					if(!kill){
						newStep.setAlive(i, j);
					}
				} else { // rozpatrujemy s¹siedztwo martwej komórki
					boolean bear = decideIfBear(count);
					if(bear){
						newStep.setAlive(i, j);
					}
				}
			}
		}
		
		return newStep;
	}

	protected abstract boolean decideIfKill(int count);
	
	protected abstract boolean decideIfBear(int count);

	private int countNeighbors(int x, int y, Table table) {

		int iStart = x == 0 ? 0 : (x-1); // warunki brzegowe planszy
		int jStart = y == 0 ? 0 : (y-1);
		int sum = 0;
		
		for(int i = iStart ; i <= x+1 && i < table.getXLenght(); i++){
			for(int j = jStart ; j <= y+1 && j < table.getYLenght(); j++){
				if(!(x == i && y == j) && table.isAlive(i, j)){
					sum++;
				}
			}
		}
		
		return sum;
	}
}
