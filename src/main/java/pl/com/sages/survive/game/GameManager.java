package pl.com.sages.survive.game;

import java.util.Scanner;

import pl.com.sages.survive.game.strategies.ConwayStrategy;
import pl.com.sages.survive.game.strategies.LabitintStrategy;
import pl.com.sages.survive.game.strategies.NaroslStrategy;
import pl.com.sages.survive.game.strategies.ServetyStrategy;
import pl.com.sages.survive.game.strategies.Survive;

public class GameManager {
	
	private Table board;
	private Survive surviveStrategy;
	private TablePrintable boardPrinter;
	
	public GameManager(Table board, Survive surviveStrategy, TablePrintable boardPrinter) {
		this.board = board;
		this.surviveStrategy = surviveStrategy;
		this.boardPrinter = boardPrinter;
	}
	
	public Table nextMove(){
		this.board = surviveStrategy.makeMove(board);
		boardPrinter.printTable(board);
		return board;
	}
	
	private void initBoard(int probability) {
		new RandomTableGenerator().generateBoard(board, probability);
		boardPrinter.printTable(board);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter - next move\nother - exit game");
		int sizeX = 18;
		int sizeY = 45;
		GameManager gm = new GameManager(new Table(sizeX, sizeY),
				new ConwayStrategy(),
				//new NaroslStrategy(),
				//new LabitintStrategy(),
				//new ServetyStrategy(),
				new TablePrinter());
		gm.initBoard(15);
		
		Scanner scanner = new Scanner(System.in);
	    String readString = scanner.nextLine();
	    while(readString!=null) {

	        if(readString.isEmpty()){
	        	gm.nextMove();
	        } else {
	        	break;
	        }
	        readString = scanner.nextLine();
	    }
	    scanner.close();
	    
	}

	
	
	

}
