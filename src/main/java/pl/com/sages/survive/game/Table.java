package pl.com.sages.survive.game;

public class Table {
	
	public static final char ALIVE = '#';
	public static final char DEAD = ' ';
	
	private char[][] board;
	
	public Table(int x, int y){
		this.board = new char[x][y];
		init(this.board);
	}

	public Table(Table table) {
		this(table.getXLenght(), table.getYLenght());
	}

	private void init(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = DEAD;
			}
		}
		
	}

	public char[][] getBoard() {
		return board;
	}

	public void setBoard(char[][] board) {
		this.board = board;
	}
	
	public boolean isAlive(int x, int y){
		return board[x][y] == ALIVE;
	}
	
	public int getXLenght(){
		return board.length;
	}
	
	public int getYLenght(){
		return board[0].length;
	}

	public void setAlive(int x, int y) {
		this.board[x][y] = ALIVE;
	}
	
	
	

}
