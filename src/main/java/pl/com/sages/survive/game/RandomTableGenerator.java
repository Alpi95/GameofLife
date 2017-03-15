package pl.com.sages.survive.game;

import java.util.Random;

public class RandomTableGenerator {

	/**
	 * Generate random board based on probability
	 * @param board
	 * @param propability 0 - 100 (0 - no alive, 100 - all alive)
	 */
	public void generateBoard(Table board, int probability){
		Random random = new Random();
		for(int i = 0; i < board.getXLenght(); i++){
			for(int j = 0; j < board.getYLenght(); j++){
				if(random.nextInt(101) <= probability){
					board.setAlive(i, j);
				}
			}
			
		}
		
	}
}
